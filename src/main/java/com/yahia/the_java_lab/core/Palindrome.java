package com.yahia.the_java_lab.core;

public class Palindrome {

    public static boolean isPalindrome(String str){
        if( str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Yahia"));
        System.out.println(isPalindrome("malalam"));

    }
}
