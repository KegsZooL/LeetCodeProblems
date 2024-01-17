package com.leetcode.trees.problem_108;

/* Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced binary search tree. */

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums){

        if(nums == null || nums.length == 0){
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end){

        if(start > end){
            return null;
        }

        int middle = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        root.left = sortedArrayToBST(nums, start, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, end);

        return root;
    }
}