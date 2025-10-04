package com.yahia.the_java_lab.core;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {

    public static void fibonacci(int count){
        int num1 = 0;
        int num2 = 1;
        int fib;
        System.out.print(num1+" "+num2);
        for (int i =1;i<count-1;i++){
            fib = num1+num2;
            System.out.print(" "+fib);
            num1 = num2;
            num2 = fib;

        }
        System.out.println();
    }

    //using stream api - stream iterate
    public static void streamFibonacci(int count){
        Stream.iterate(new long[]{0,1},arr-> new long[]{arr[1],arr[0]+arr[1]})
                .limit(count)
                .map(arr->arr[0])
                .forEach(s-> System.out.print(s+" "));
    }

    public static void main(String[] args) {
        fibonacci(20);
        streamFibonacci(20);
    }
}
