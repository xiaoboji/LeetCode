package com.xiaoboji.day001;

/**
 * @program: leetcode
 * @description: 70-爬楼梯,https://leetcode-cn.com/problems/climbing-stairs/
 * @author: xiaoboji
 * @create: 2021-01-26 22:39
 **/
public class Solution {
  public int climbStairs(int n) {
    if(n < 2){
      return 1;
    }

    int[] result = new int[n+1];
    result[0] = 1;
    result[1] = 1;
    for (int i = 2; i<=n; i++) {
      result[i] = result[i-1] + result[i-2];
    }
    return result[n];
  }
}
