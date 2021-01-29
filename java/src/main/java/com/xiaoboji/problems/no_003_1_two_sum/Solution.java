package com.xiaoboji.problems.no_003_1_two_sum;

/**
 * @program: leetcode
 * @description: 66-加一：https://leetcode-cn.com/problems/plus-one/
 * @author: xiaoboji
 * @create: 2021-01-26 22:49
 **/
public class Solution {
  public int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++){
      for (int j = i + 1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){
            return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
