package com.yahia.the_java_lab.core;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
      return IntStream.range(0,str.length())
              .mapToObj(i -> str.charAt(str.length() -1 - i))
              .map(String::valueOf)
              .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(reverseUsingStringBuilder("Yahia"));
        System.out.println(reverseForLoop("Yahia"));
        System.out.println(reverseUsingStream("Yahia"));
        System.out.println(reverseUsingStream("mammammma"));
    }
}
