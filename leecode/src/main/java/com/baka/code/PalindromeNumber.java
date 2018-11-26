package com.baka.code;

import java.util.Arrays;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        boolean flag=true;
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i] != chars[chars.length-i-1]) {
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
