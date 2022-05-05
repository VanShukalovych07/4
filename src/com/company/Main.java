package com.company;

public class Main {

    public static void main(String[] args) {
            int temp = func(2,5);
            System.out.println(temp);
        }
        public static int func ( int a,int b ) {
            int result = 1;
            for (int i = 0;i < b;i++)
                result *= a;
            return result;
        }

    }



