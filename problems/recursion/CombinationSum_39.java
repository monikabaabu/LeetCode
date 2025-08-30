class Solution {
    private static void combination(int[] candidates, int target, List<Integer> comb, List<List<Integer>> res, int total, int i){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || i >= candidates.length){
            return;
        }
        comb.add(candidates[i]);
        combination(candidates, target, comb, res, total+ candidates[i], i);
        comb.remove(comb.size()-1);
        combination(candidates, target, comb, res, total, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combination(candidates, target, new ArrayList<>(),res, 0, 0 );
        return res;
    }
}