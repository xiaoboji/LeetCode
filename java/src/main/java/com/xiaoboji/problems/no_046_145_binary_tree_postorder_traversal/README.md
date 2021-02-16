# leetcode链接

- [二叉树的后序遍历](https://leetcode-cn.com/problems/binary-tree-postorder-traversal/)

- 解题思路
    * 递归法
```java
class SolutionRecursion {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    public void postorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}
```

时间复杂度：O(n)，其中n为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)的级别。

  * 迭代法
```java
class SolutionIteration {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                list.add(root.val);
                stack.push(root);
                root = root.right;
            }

            TreeNode cur = stack.pop();
            root = cur.left;
        }
        // 跟右左的一个逆序
        Collections.reverse(list);
        return list;

    }
}
```
时间复杂度：O(n)，其中n为二叉树节点的个数。二叉树的遍历中每个节点会被访问一次且只会被访问一次。

空间复杂度：O(n),空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 O(n)的级别。

