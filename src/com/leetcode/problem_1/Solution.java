package com.leetcode.problem_1;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] idCurrentSumm = new int[2];

        for (int i = 0; i < nums.length; i++) {

            idCurrentSumm[0] = i;

            for (int j = 0; j < nums.length; j++) {
                if((nums[i] + nums[j] == target) && ( i != j)) {
                    idCurrentSumm[1] = j;
                    return idCurrentSumm;
                }
            }
        }
        return null;
    }
}