package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] count = new int[26];
        for (int i : count) {
            count[i] = 0;
        }

        for (String s : list) {
            char[] arr = s.toCharArray();
            for (char c : arr) {
                if (alphabet.contains(c)) {
                    count[alphabet.indexOf(c)]++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(abcArray[i] + " " + count[i]);
        }


    }

}
