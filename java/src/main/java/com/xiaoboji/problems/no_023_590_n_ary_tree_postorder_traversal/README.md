# leetcode链接

- [N叉树的后序遍历](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal)

- 解题思路
    * 方法一：递归实现
```java
class Solution {
    public List<Integer> postorder(Node root) {
        // 后续遍历，先孩子再父亲
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    public void postorder(Node node,List<Integer> list) {
        if (node == null) {
            return ;
        }
        for (Node n : node.children) {
            postorder(n, list);
        }
        list.add(node.val);
    }
}
```
