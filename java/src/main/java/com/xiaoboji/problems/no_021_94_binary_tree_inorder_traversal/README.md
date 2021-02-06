# leetcode链接

- [二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

- 解题思路
    * 递归
```java
class Solution {
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

        buildTree(node.left, list);
        list.add(node.val);
        buildTree(node.right, list);

    }
}
```
