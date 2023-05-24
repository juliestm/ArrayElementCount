package com.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementCountJava {

    public Map<Integer, Integer> countElements(int[] array) {

        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : array) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        return counter;
    }

}
