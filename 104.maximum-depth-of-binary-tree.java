import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 *
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (61.66%)
 * Likes:    1816
 * Dislikes: 62
 * Total Accepted:    656.4K
 * Total Submissions: 1M
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given binary tree [3,9,20,null,null,15,7],
 * 
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * return its depth = 3.
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
    private int ite(TreeNode root) {
        if(root == null) return 0;
        TreeNode cur = root;
        Stack<TreeNode> left = new Stack();
        Stack<TreeNode> right = new Stack();
        left.push(root);
        int res = 1;
        while(!left.isEmpty() || !right.isEmpty()){
            Stack<TreeNode> full = left.isEmpty() ? right : left;
            Stack empty = left.isEmpty() ? left : right;
            while(!full.isEmpty()){
                TreeNode tmp = full.pop();
                if(tmp.left != null) empty.push(tmp.left);
                if(tmp.right != null) empty.push(tmp.right);
            }
            if(empty.isEmpty()) return res;
            res++;
        }
        return res;

    }
}
// @lc code=end

