- leetcode链接

[77. 组合](https://leetcode-cn.com/problems/combinations/)
- 解题思路

既然是树形问题上的 深度优先遍历，因此首先画出树形结构。例如输入：n = 4, k = 2，我们可以发现如下递归结构：

如果组合里有 1 ，那么需要在 [2, 3, 4] 里再找 11 个数；
如果组合里有 2 ，那么需要在 [3, 4] 里再找 11数。注意：这里不能再考虑 11，因为包含 11 的组合，在第 1 种情况中已经包含。

```
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        // 从1开始
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }

  private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
      // 递归终止条件是：path 的长度等于 k
      if (path.size() == k) {
        res.add(new ArrayList<>(path));
        return;
      }
      // 遍历可能的搜索起点//i <= n - (k - path.size()) + 1
      for (int i = begin; i <= n - (k - path.size()) + 1; i++) {
        // 向路径变量里添加一个数
        path.addLast(i);
        // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
        dfs(n, k, i + 1, path, res);
        // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
        path.removeLast();
      }
    }
```