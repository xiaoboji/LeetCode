package com.xiaoboji.problems.no_001_70_climbing_stairs;//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1465 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
//leetcode submit region end(Prohibit modification and deletion)
