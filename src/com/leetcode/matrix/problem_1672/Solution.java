package com.leetcode.matrix.problem_1672;

class Solution {

    public int maximumWealth(int[][] accounts){

        int summ = 0, currentLineSumm = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                currentLineSumm += accounts[i][j];
            }
            if(currentLineSumm > summ){
                summ = currentLineSumm;
            }
            currentLineSumm = 0;
        }
        return summ;
    }
}
