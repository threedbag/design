package com.baka.code;

public class RomanToInt {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int[] sum=new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case 'M':
                    if (i == 0) {
                        sum[i]=1000;
                        break;
                    }
                    if (chars[i-1]=='C'){
                        sum[i-1]=900;
                        sum[i]=0;
                    }else {
                        sum[i]=1000;
                    }
                    break;
                case 'D':
                    if (i == 0) {
                        sum[i]=500;
                        break;
                    }
                    if (chars[i-1]=='C'){
                        sum[i-1]=400;
                        sum[i]=0;
                    }else {
                        sum[i]=500;
                    }
                    break;
                case 'C':
                    if (i == 0) {
                        sum[i]=100;
                        break;
                    }
                    if (chars[i-1]=='X'){
                        sum[i-1]=90;
                        sum[i]=0;
                    }else {
                        sum[i]=100;
                    }
                    break;
                case 'L':
                    if (i == 0) {
                        sum[i]=50;
                        break;
                    }
                    if (chars[i-1]=='X'){
                        sum[i-1]=40;
                        sum[i]=0;
                    }else {
                        sum[i]=50;
                    }
                    break;
                case 'X':
                    if (i == 0) {
                        sum[i]=10;
                        break;
                    }
                    if (chars[i-1]=='I'){
                        sum[i-1]=9;
                        sum[i]=0;
                    }else {
                        sum[i]=10;
                    }
                    break;
                case 'V':
                    if (i == 0) {
                        sum[i]=5;
                        break;
                    }
                    if (chars[i-1] == 'I') {
                        sum[i-1]=4;
                        sum[i]=0;
                    }else {
                        sum[i]=5;
                    }
                    break;
                case 'I':
                    sum[i]=1;
                    break;
            }
        }
        int su=0;
        for (int n : sum) {
            su+=n;
        }
        return su;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
