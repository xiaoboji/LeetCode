# leetcode链接

- [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

- 解题思路
    * 递归法
```java
class SolutionRecursion {
    // 中序遍历，左子树——根节点——右子树
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode node, List<Integer> list) {
        if(node == null){
            return;
        }

        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);

    }
}
```

时间复杂度：O(n)，其中 nn 为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)O(n) 的级别。

  * 迭代法
```java
class SolutionIteration {
    // 中序遍历，左子树——根节点——右子树
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // 维护一个栈，充当JVM里方法栈的作用
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            // 一直到左边为null
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // 出栈，回到上一个节点，保存值，然后找右边
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
```
时间复杂度：O(n)，其中 nn 为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)的级别。
