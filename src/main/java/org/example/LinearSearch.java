package org.example;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1, 5, 3, 9, 7, 14, 10};
        int target = 5;
        System.out.println(isPresent(nums, target));
    }

//  If you want to return the index/position of the number if present, else return -1

    private static int isPresent(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

//    If you want to check if the number is present or not

//    private static boolean isPresent(int[] nums, int target){
//        for(int num:nums){
//            if(num == target){
//                return true;
//            }
//        }
//        return false;
//    }
}
