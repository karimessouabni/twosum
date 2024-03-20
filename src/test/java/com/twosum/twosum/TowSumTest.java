package com.twosum.twosum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TowSumTest {

    @Test
    void getPairFromArray() {

        ArrayList<Integer> tab = new ArrayList<>();

        tab.add(4);
        tab.add(5);
        tab.add(2);
        tab.add(-4);
        tab.add(8);
        tab.add(11);

        int s = 8;

        Set<Pair> pairFromArray = TowSum.getPairFromArray(tab, s);

        assertEquals(2, pairFromArray.size());


    }
}