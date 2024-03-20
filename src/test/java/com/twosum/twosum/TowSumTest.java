package com.twosum.twosum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TowSumTest {

    @Test
    void getPairFromArray() {

        ArrayList<Integer> tab = new ArrayList<>(Arrays.asList(3, 5, 2, -4, 8, 11));
        int s = 8;
        Set<Pair> pairFromArray = TowSum.getPairFromArray(tab, s);

        assertEquals(2, pairFromArray.size());


    }
}