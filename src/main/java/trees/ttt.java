package trees;

import com.sun.source.tree.Tree;

public class ttt {

    // EASY 112. https://leetcode.com/problems/path-sum/
    // HARD 124 https://leetcode.com/problems/binary-tree-maximum-path-sum/

    // DFS - search in depth (в глубину)
    // BFS - в ширину

//    public boolean hasPathSum(TreeNode root, int targetSum) {
//
//    }


    // Time O(n)
    // Space O(n)
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxLeftPath = maxPathSum(root.left);
        int maxRightPath = maxPathSum(root.right);

        return Math.max(maxLeftPath, maxRightPath) + root.val;
    }




    int answer = 0;
    public int maxPathSumHard(TreeNode root) {

        helper(root);
        return answer;
    }
    int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int maxLeftPath = Math.max(helper(node.left), 0);
        int maxRightPath = Math.max(maxPathSum(node.right), 0);

        answer = Math.max(answer, maxLeftPath + maxRightPath + node.val);
        return Math.max(maxLeftPath, maxRightPath) + node.val;
    }
}
