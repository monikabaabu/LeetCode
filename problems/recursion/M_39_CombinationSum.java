class Solution {
    private static void combination(int[] arr, int t, List<Integer> list , List<List<Integer>> res, int i){
        if(t ==0){
            res.add(new ArrayList<>(list));
            return;
        }
        else if(t<0 || i>=arr.length){
            return;
        }
        list.add(arr[i]);
        combination(arr,t-arr[i],list,res,i);
        list.remove(list.size() - 1);
        combination(arr,t,list,res,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combination(candidates, target, new ArrayList<>(),res, 0);
        return res;
    }
}