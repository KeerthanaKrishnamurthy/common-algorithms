package org.example;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1, 5, 3, 9, 7, 14, 10};
        int target = 5;
        System.out.println(isPresent(nums, target));
    }
    private static boolean isPresent(int[] nums, int target){
        for(int num:nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
