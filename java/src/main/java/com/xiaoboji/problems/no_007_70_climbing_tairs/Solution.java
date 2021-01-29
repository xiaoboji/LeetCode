package com.xiaoboji.problems.no_007_70_climbing_tairs;

class Solution {
    public int climbStairs(int n) {
        int[] result = new int[n+1];
        if(n <= 0){
            return 1;
        }
        result[0] = 1;
        result[1] = 1;

        for(int i = 2; i < result.length; i++){
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }
}
