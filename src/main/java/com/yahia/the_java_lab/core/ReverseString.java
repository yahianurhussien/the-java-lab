package com.yahia.the_java_lab.core;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ReverseString {

    public static String reverseUsingStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();

    }

    //using for loop
    public static String reverseForLoop(String str){
        char[] chars = str.toCharArray();

        for( int i = 0; i < (chars.length)/2; i++){
           char tmp = chars[i];
           chars[i] = chars[chars.length - 1 - i];
           chars[chars.length - 1 - i] = tmp;
        }

        return new String(chars);
    }

    public static String reverseUsingStream(String str){

    }

    public static void main(String[] args) {
        System.out.println(reverseUsingStringBuilder("Yahia"));
        System.out.println(reverseForLoop("Yahia"));
    }
}
