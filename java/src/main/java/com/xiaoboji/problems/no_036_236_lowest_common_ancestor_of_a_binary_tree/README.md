- leetcode链接

[236. 二叉树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/)
- 解题思路
    *  存储父节点方法,存储其中一个节点的所有父节点，然后逐个进行比较
```
class SolutionSave {

    Map<Integer, TreeNode> parent = new HashMap<Integer, TreeNode>();
    Set<Integer> visited = new HashSet<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        // 先存储p的所有父节点
        while (p != null) {
            visited.add(p.val);
            p = parent.get(p.val);
        }
        while (q != null) {
            if (visited.contains(q.val)) {
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    private void dfs(TreeNode root) {
        // 存储当前节点和其父节点
        if (root.left != null) {
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if (root.right != null) {
            parent.put(root.right.val, root);
            dfs(root.right);
        }
    }
}
```
复杂度分析

时间复杂度：O(N)，其中N是二叉树的节点数。二叉树的所有节点有且只会被访问一次，从p和q节点往上跳经过的祖先节点个数不会超过N，因此总的时间复杂度为O(N)。

空间复杂度：O(N)，其中N是二叉树的节点数。递归调用的栈深度取决于二叉树的高度，二叉树最坏情况下为一条链，此时高度为N，因此空间复杂度为O(N)，哈希表存储每个节点的父节点也需要 O(N) 的空间复杂度，因此最后总的空间复杂度为 O(N)。

