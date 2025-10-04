package com.yahia.the_java_lab.core;

public class Fibonacci {

    public static void fibonacci(int count){
        int num1 = 0;
        int num2 = 1;
        int fib;
        System.out.print(num1+" "+num2);
        for (int i =1;i<count;i++){
            fib = num1+num2;
            System.out.print(" "+fib);
            num1 = num2;
            num2 = fib;

        }

    }

    public static void main(String[] args) {
        fibonacci(20);
    }
}
