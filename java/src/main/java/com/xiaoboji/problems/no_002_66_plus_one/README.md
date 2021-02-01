# leetcode
[66. 加一 https://leetcode-cn.com/problems/plus-one/](https://leetcode-cn.com/problems/plus-one/)

# 解题思路
- 思路(常规递归)
    * 分析得到，有两种情况，9和非9
    * 从最后一位循环，非9的话，直接+1返回
    * 否则进位1
    * 单独处理一下999这种情况
    * 循环一遍，时间复杂度O(n),空间复杂度O(1)
    
```java
public class Solution {
  public int[] plusOne(int[] digits) {
    // 两种情况9和非9，非9直接返回，9的话需要进位
    for (int i = 0; i < digits.length; i++) {
      if (digits[digits.length - 1 - i] != 9) {
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
```    