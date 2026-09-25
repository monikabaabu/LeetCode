class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        post(list,root);
        return list;
    }
    private static void post(List<Integer> list, TreeNode root){
        if(root == null) return;
        post(list, root.left);
        post(list, root.right);
        list.add(root.val);
    }
}