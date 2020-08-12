package org.mak.easy;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public int[] findCouplets(Integer[] inputArray, int targetSum) {
        if (inputArray.length < 2)
            return new int[0];
        final Set<Integer> lookup = new HashSet<>();
        for (int num : inputArray){
            final Integer potentialMatch = targetSum - num;
            if (lookup.contains(potentialMatch))
                return  new int[]{potentialMatch,num};
            else
                lookup.add(num);
        }
        return new int[0];
    }
}