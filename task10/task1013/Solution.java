package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int a1;
        private boolean a2;
        private String a3;
        private char a4;
        private double a5;
        private float a6;

        public Human(int a1) {
            this.a1 = a1;
        }

        public Human(boolean a2) {
            this.a2 = a2;
        }

        public Human(String a3) {
            this.a3 = a3;
        }

        public Human(char a4) {
            this.a4 = a4;
        }

        public Human(double a5) {
            this.a5 = a5;
        }

        public Human(float a6) {
            this.a6 = a6;
        }

        public Human(int a1, boolean a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        public Human(double a5, float a6) {
            this.a5 = a5;
            this.a6 = a6;
        }

        public Human(int a1, String a3, double a5) {
            this.a1 = a1;
            this.a3 = a3;
            this.a5 = a5;
        }

        public Human(String a3, char a4, double a5, float a6) {
            this.a3 = a3;
            this.a4 = a4;
            this.a5 = a5;
            this.a6 = a6;
        }
    }
}
