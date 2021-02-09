package com.xiaoboji.problems.no_023_590_n_ary_tree_postorder_traversal;//给定一个 N 叉树，返回其节点值的前序遍历。
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 138 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import com.xiaoboji.common.Node;

import java.util.ArrayList;
import java.util.List;

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
//leetcode submit region end(Prohibit modification and deletion)
