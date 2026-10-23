class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int flag =0;
        while(!q.isEmpty()){
            List<Integer> t = new ArrayList<>();
            int s = q.size();
            for(int i=0;i<s;i++){
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                t.add(q.poll().val);
            }
            if(flag ==0){
                ans.add(t);
                flag =1;
            }
            else{
                Collections.reverse(t);
                ans.add(t);
                flag =0;
            }
        }
        return ans;
    }
}