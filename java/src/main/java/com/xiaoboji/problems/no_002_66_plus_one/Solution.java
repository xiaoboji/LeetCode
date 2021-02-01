package com.xiaoboji.problems.no_002_66_plus_one;

/**
 * @program: leetcode
 * @description: 66-加一：https://leetcode-cn.com/problems/plus-one/
 * @author: xiaoboji
 * @create: 2021-01-26 22:49
 **/
public class Solution {
  public int[] plusOne(int[] digits) {
    // 两种情况9和非9，非9直接返回，9的话需要进位
    for (int i = 0; i < digits.length; i++){
      if(digits[digits.length - 1 - i] != 9){
        digits[digits.length - 1 - i]++;
        return digits;
      } else {
        digits[digits.length - 1 - i] = 0;
      }
    }

    // 处理999的情况
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
  }
}
