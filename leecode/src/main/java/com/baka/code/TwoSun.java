package com.baka.code;


import java.util.Arrays;

public class TwoSun {
    public static int[] twoSum(int[] nums, int target) {
        int[] a={0,0};
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length&&j!=i; j++) {
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a={0,4,3,0};
        int target=0;
        int[] ints = twoSum(a, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
