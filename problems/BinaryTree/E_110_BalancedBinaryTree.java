class Solution {
    public boolean isBalanced(TreeNode node) {
        //     return check(root);
        // }

        // private boolean check(TreeNode node) {
        if (node == null) return true;

        if (Math.abs(height(node.left) - height(node.right)) > 1)
            return false;

        return isBalanced(node.left) && isBalanced(node.right);
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
