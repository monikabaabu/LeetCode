class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        pre(root,list);
        return list;
    }
    private static void pre(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        pre(node.left,list);
        pre(node.right,list);
    }
}