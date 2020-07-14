import java.util.Queue;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
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
    public int minDepth(TreeNode root) {
        // if(root == null) return 0;
        // if(root.left == null) return minDepth(root.right) + 1;
        // if(root.right == null) return minDepth(root.left) + 1;
        // return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        return ite(root);
    }

    private int ite(TreeNode root){
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        int level = 1;
        while(queue.size() != 0){
            TreeNode first = queue.poll();
            if(first == null) {
                level++;
                queue.add(null);
                continue;
            }
            if(first.left == null && first.right == null) return level;
            if(first.left != null) queue.add(first.left);
            if(first.right != null) queue.add(first.right);
        }
        return level;
    }
}
// @lc code=end

