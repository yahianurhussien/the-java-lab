package com.yahia.the_java_lab.core;

import java.io.FilterOutputStream;

public class ReverseString {

    public static String reverseUsingStringBuilder(String str){
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseUsingStringBuilder("Yahia"));
    }
}
