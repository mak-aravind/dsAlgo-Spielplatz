package org.mak.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public int[] findCouplets(Integer[] inputArray, int targetSum) {
        final Map<Integer, Integer> lookupTable = new HashMap<Integer, Integer>();
        for (int i =0; i < inputArray.length; i++){
            final Integer potentialMatch = targetSum - inputArray[i];
            if (lookupTable.containsKey(potentialMatch))
                return  new int[]{lookupTable.get(potentialMatch),i};
            else
                lookupTable.put(inputArray[i],i);
        }
        return new int[0];
    }
}