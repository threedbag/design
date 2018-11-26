package com.baka.code;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if (strs == null || strs.length==0 || strs[0]=="") {
            return "";
        }
        char[] start = strs[0].toCharArray();
        char[] end = strs[strs.length - 1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < start.length; i++) {
            if (start[i]==end[i]){
                sb.append(start[i]);
            }else {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs={};
        System.out.println(longestCommonPrefix(strs));
    }
}
