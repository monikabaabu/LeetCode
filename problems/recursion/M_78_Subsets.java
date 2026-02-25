class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(nums, new ArrayList<>() , list,0 );
        return list;
    }
    private static void backtrack(int[] nums, List<Integer> l, List<List<Integer>> list, int i){
        if(i==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        backtrack(nums,l,list,i+1);
        l.remove(l.size()-1);
        backtrack(nums,l,list,i+1);
    }
}