package com.leetcode.trees.problem_100;

/*Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.*/

import java.util.List;
import java.util.ArrayList;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q){

        if(p == q)
            return true;

        List<TreeNode> firstTreeNodes = new ArrayList();
        List<TreeNode> secondTreeNodes = new ArrayList<>();

        firstTreeNodes.add(p);
        secondTreeNodes.add(q);

        performTreeTraversal(p, firstTreeNodes);
        performTreeTraversal(q, secondTreeNodes);

        for (int i = 0; i < firstTreeNodes.size(); i++) {

            if(firstTreeNodes.get(i) == null && secondTreeNodes.get(i) == null) {
                continue;
            }
            else if(firstTreeNodes.get(i) == null && secondTreeNodes.get(i) != null){
                return false;
            }
            else if(firstTreeNodes.get(i) != null && secondTreeNodes.get(i) == null){
                return false;
            }
            else if(firstTreeNodes.get(i).val == secondTreeNodes.get(i).val){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    private void performTreeTraversal(TreeNode root, List<TreeNode> treeNodes){

        if(root != null){

            treeNodes.add(root.left);
            performTreeTraversal(root.left, treeNodes);

           treeNodes.add(root.right);
            performTreeTraversal(root.right, treeNodes);
        }
    }
}
