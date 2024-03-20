package com.twosum.twosum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TowSum {

    public static Set<Pair> getPairFromArray(List<Integer> tab, int sNumber) {

        Set<Pair> pariResult = new HashSet<>();
        for (Integer n1 : tab) {
            for (Integer n2 : tab) {
                if (n1 + n2 == sNumber) {
                    pariResult.add(new Pair(n1, n2));
                }
            }
        }
        return pariResult;
    }
}
