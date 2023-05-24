package com.test;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayElementCountJava arrayElementCountJava = new ArrayElementCountJava();

        int[] array = {1, 4, 3, 2, 5, 2, 5, 6};

        Map<Integer, Integer> counter = arrayElementCountJava.countElements(array);

        System.out.println(counter);
    }

}