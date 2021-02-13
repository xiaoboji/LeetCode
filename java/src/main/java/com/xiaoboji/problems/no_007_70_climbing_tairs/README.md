# leetcode链接
[70 爬楼梯 https://leetcode-cn.com/problems/climbing-stairs/](https://leetcode-cn.com/problems/climbing-stairs/)

# 解题思路
```java
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] results = new int[n + 1];
        results[0] = 1;
        results[1] = 1;
        // 从 0 1 开始往后增加
        for (int i = 2; i <= n ; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }

        return results[n];
    }
}
```

常规解法可以分成多个子问题，爬第n阶楼梯的方法数量，等于 2 部分之和。

爬上 n-1n−1 阶楼梯的方法数量。因为再爬1阶就能到第n阶<br>
爬上 n-2n−2 阶楼梯的方法数量，因为再爬2阶就能到第n阶<br>
所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]dp[n]=dp[n−1]+dp[n−2]<br>
同时需要初始化 dp[0]=1dp[0]=1 和 dp[1]=1dp[1]=1<br>
时间复杂度：O(n)O(n)<br>
