package com.dl.structure.tree;


import com.dl.tags.M_Recursion;
import com.dl.tags.T_Tree;

/**
 * 单值二叉树
 * @see <a href="https://leetcode.cn/problems/univalued-binary-tree/">LeetCode</a>
 */
@T_Tree
@M_Recursion
public class UniValuedBinaryTree {
    public boolean isUniValTree(TreeNode root) {
        int val  = root.val;
        return isSingleVal(val,root);
    }

    private boolean isSingleVal(Integer val,TreeNode root){
        if(root==null) return true;
        return ((root.val == val) && isSingleVal(val,root.left) && isSingleVal(val,root.right));
    }
}
