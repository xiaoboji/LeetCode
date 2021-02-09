# leetcode链接

- [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/)

- 解题思路
    * 方法一、递归法
```java
class Solution {

    // 按层进行存储递归,按层进行存储
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root != null){
            levelOrder(root, 0, result);
        }
        return result;
    }

    public void levelOrder(Node node, int level, List<List<Integer>> result) {
        if (result.size() <= level) {
            result.add(new ArrayList<Integer>());
        }

        result.get(level).add(node.val);
        for (Node n : node.children) {
            levelOrder(n, level + 1, result);
        }
    }
}
```