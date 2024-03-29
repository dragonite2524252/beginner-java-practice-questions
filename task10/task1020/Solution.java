package com.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (smallest > array[j]) {
                    smallest = array[j];
                    array[j] = array[i];
                    array[i] = smallest;
                }
            }
        }
    }

}
