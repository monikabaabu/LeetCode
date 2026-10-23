class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        max = Math.max(max, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
