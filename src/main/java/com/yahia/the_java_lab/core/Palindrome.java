package com.yahia.the_java_lab.core;

import java.util.stream.IntStream;

public class Palindrome {

    public static boolean isPalindrome(String str){
        if( str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())){
            return true;
        }

        return false;
    }


    public static boolean isPalindromeLoop(String str){
        for(int i = 0; i < Math.sqrt(str.length()); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeStream(String str){
        if(str == null) return false;
        int length = str.length();
        return IntStream.range(0,length/2)
                .allMatch(n->str.charAt(n) == str.charAt(length - 1 - n));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Yahia"));
        System.out.println(isPalindrome("malalam"));

        System.out.println(isPalindromeLoop("yahia"));
        System.out.println(isPalindromeLoop("malalam"));

        System.out.println(isPalindromeStream("yahia"));
        System.out.println(isPalindromeStream("malalam"));

    }
}
