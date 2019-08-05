package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        int counter = 0;
        while (counter < 43) {
            System.out.println(s.substring(counter));
            counter++;
        }
    }

}

