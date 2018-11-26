package com.baka.code;

import java.util.ArrayList;
import java.util.List;

public class IsValid {
    public static boolean isValid(String s){
        if (s.length()==0 || "".equals(s)){
            return true;
        }
        char[] chars = s.toCharArray();
        List<Character> list=new ArrayList<>();
        if (chars[0]==']'||chars[0]=='}'||chars[0]==')'||chars.length%2==1){
            return false;
        }
        list.add(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i]-list.get(list.size()-1)==2||chars[i]-list.get(list.size()-1)==1){
                list.remove(list.size()-1);
                if (list.size()==0&&chars.length>i+1){
                    i++;
                    list.add(chars[i]);
                }
            }else {
                list.add(chars[i]);
            }
        }
        if (list.size() == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
         System.out.println(isValid("()[]{}"));
    }
}
