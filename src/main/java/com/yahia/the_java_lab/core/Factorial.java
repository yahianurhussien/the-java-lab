package com.yahia.the_java_lab.core;

import java.math.BigInteger;
import java.util.stream.IntStream;

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

    // using stream api
    public static int steamFactorial(int num){
        if(num < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        return IntStream.rangeClosed(1,num)
                .reduce( 1,(a,b) -> a*b ); // starting from 1 it multiplies a anb b

    }

    //factorial grows really fast for num > 20 it won't even fit in a long
    // use BigInteger
    public static BigInteger steamFactorialBigInteger(int num){
        if(num < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        return IntStream.rangeClosed(1,num)
                .mapToObj(BigInteger::valueOf)
                .reduce( BigInteger.ONE,(BigInteger::multiply)); // starting from 1 it multiplies a anb b

    }

    // we can use parallel stream for fast factorial calculation
    public static BigInteger parallelStreamFactorial(int num){
        if(num < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");

        return IntStream.rangeClosed(1,num)
                .parallel()//enable parallelism
                .mapToObj(BigInteger::valueOf)
                .reduce( BigInteger.ONE,(BigInteger::multiply)); // starting from 1 it multiplies a anb b

    }


    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(5));
        System.out.println(steamFactorial(5));
        System.out.println(steamFactorialBigInteger(25));
        System.out.println(parallelStreamFactorial(40));

    }
}
