# leetcode链接

- [N叉树的前序遍历](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/n-ary-tree-preorder-traversal/)

- 解题思路
    * 方法一：递归实现
```java

class Solution {
    // 先根后孩子
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;

    }
    public void preorder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        for (Node n : node.children) {
            preorder(n, list);
        }
    }

}
```

- 时间复杂度：O(n)。n指的是节点的数量
- 空间复杂度：正常情况 O(log n)，最坏情况 O(n)。运行时在堆栈上的空间。



