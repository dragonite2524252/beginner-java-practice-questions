package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[3];
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        ArrayList<String> s3 = new ArrayList<>();
        s1.add("d");
        s2.add("asfdef");
        s3.add("sfef");
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}