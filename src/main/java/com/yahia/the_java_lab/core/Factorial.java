package com.yahia.the_java_lab.core;

public class Factorial {

    // traditional way
    public static int factorial(int num){
        int result = 1;
        for ( int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
    }

    // recursive way
    public static int recursiveFactorial(int num){
        if (num == 1) return 1;

        return num * factorial(num - 1);
    }


    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(5));
    }
}
