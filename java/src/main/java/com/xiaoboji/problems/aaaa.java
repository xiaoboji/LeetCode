package com.xiaoboji.problems;/**
* @program: java
*
* @description: 啊啊
*
* @author: xiaoboji
*
* @create: 2021-03-01 00:03
**/
public class aaaa {
  // java
  public int binarySearch(int[] array, int target)
    {
      int left = 0, right = array.length - 1, mid;
      while (left <= right) {
        mid = (right - left) / 2 + left;
        if (array[mid] == target) {
          return mid;
        } else if (array[mid] > target) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
      return -1;
    }
}
