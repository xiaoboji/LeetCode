# leetcode
[70. 爬楼梯 https://leetcode-cn.com/problems/climbing-stairs/](https://leetcode-cn.com/problems/climbing-stairs/)

# 解题思路
```
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        //相当于做了一个结果缓存
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
     }
}
```

空间复杂度：O(N)
时间复杂度：O(N)