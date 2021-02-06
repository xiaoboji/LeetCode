# leetcode链接

- [二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal/)

- 解题思路
    * 递归法
```java
class SolutionIteration {
    // 前序遍历 根节点——左子树——右子树
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}
```

时间复杂度：O(n)，其中 nn 为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)O(n) 的级别。

  * 迭代法
```java
class SolutionRecursion {
    // 前序遍历 根节点——左子树——右子树
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Deque<TreeNode> stack = new LinkedList<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;
    }
}
```
时间复杂度：O(n)，其中 nn 为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)的级别。

