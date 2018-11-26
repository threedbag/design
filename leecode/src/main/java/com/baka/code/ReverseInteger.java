package com.baka.code;

public class ReverseInteger {
    public static int reverse(int x) {
        if (x <= -Math.pow(2, 31) || x > Math.pow(2, 31) - 1) {
            return 0;
        }
        String s = x + "";
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = chars.length-1; i >0; i--) {
            sb.append(chars[i]);
        }
        try {


        if (chars[0]=='-') {
            return -Integer.parseInt(sb.toString());
        }else {
            sb.append(chars[0]);
            return Integer.parseInt(sb.toString());
        }
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        int reverse = reverse(-123);
        System.out.println(reverse);
    }
}
