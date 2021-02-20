package com.xiaoboji.problems.no_037_105_onstruct_binary_tree_from_preorder_and_inorder_traversal;//根据一棵树的前序遍历与中序遍历构造二叉树。
//
// 注意: 
//你可以假设树中没有重复的元素。 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics 树 深度优先搜索 数组 
// 👍 877 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.xiaoboji.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int prelen = preorder.length;
        int inlen = inorder.length;
        if (prelen != inlen) {
            throw new RuntimeException("Incorrect input data. ");
        }
        // 缓存中序遍历，O(1)快速找到节点位置
        Map<Integer, Integer> map = new HashMap<>(prelen);
        for (int i = 0; i < inlen ; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,prelen - 1,map,0,inlen -1);
    }

  /**
   * Build tree tree node.
   *
   * @param preorder the preorder
   * @param preLeft the pre left 前序遍历左边界
   * @param preRight the pre right 前序遍历由边界
   * @param map the map 缓存，方便找到中序遍历的节点的位置
   * @param inLeft the in left 中序遍历左边界
   * @param inRight the in right 中序遍历右边界
   * @return the tree node
   */
  public TreeNode buildTree(int[] preorder, int preLeft, int preRight, Map<Integer,Integer> map, int inLeft, int inRight) {
      if (preLeft > preRight || inLeft > inRight) {
          return null;
      }
      int rootVal = preorder[preLeft];
      TreeNode root = new TreeNode(rootVal);
      // 前序遍历的第一节点在中序遍历中的节点的下标
      int pIndex = map.get(rootVal);
      root.left = buildTree(preorder,preLeft + 1, pIndex - inLeft + preLeft, map, inLeft, pIndex -1);
      root.right = buildTree(preorder, pIndex - inLeft + preLeft + 1, preRight, map ,pIndex + 1, inRight);
      return root;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
