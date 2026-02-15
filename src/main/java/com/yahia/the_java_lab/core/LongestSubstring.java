package com.yahia.the_java_lab.core;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s){
    char[] str = s.toCharArray();
    int max  =  0;
        for(int i = 0; i < str.length - 1; i++){
        List<Character> list = new ArrayList<>();
        list.add(str[i]);
        for(int j = i + 1; j < str.length; j++){
            if( !list.contains(str[j])){
                list.add(str[j]);
            }else{
                if (max < list.size())
                    max  = list.size();
                break;
            }
        }

    }
        return max;

}

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
