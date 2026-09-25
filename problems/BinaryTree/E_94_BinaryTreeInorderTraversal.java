class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        in(root,list);
        return list;

    }
    private static void in(TreeNode node, List<Integer> list){
        if(node == null) return ;
        in(node.left, list);
        list.add(node.val);
        in(node.right,list);
    }
}