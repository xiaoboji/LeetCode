# leetcode
[66. 加一 https://leetcode-cn.com/problems/plus-one/](https://leetcode-cn.com/problems/plus-one/)

# 解题思路

方法一：常规思路

- 分析得到，有两种情况，9和非9
- 从最后一位循环，非9的话，直接+1返回
- 否则进位
- 单独处理一下999这种情况
- 