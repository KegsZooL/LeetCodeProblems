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

    private TreeNode sortedArrayToBST(int[] nums, int startIndex, int endIndex){

        if(startIndex > endIndex){
            return null;
        }

        //Get the middle element and make it root
        int middle = startIndex + (endIndex - startIndex) / 2;
        TreeNode root = new TreeNode(nums[middle]);

        /* Recursively construct the left subtree and make it
        left child of root */
        root.left = sortedArrayToBST(nums, startIndex, middle - 1);

        /* Recursively construct the right subtree and make it
        right child of root */
        root.right = sortedArrayToBST(nums, middle + 1, endIndex);

        return root;
    }
}