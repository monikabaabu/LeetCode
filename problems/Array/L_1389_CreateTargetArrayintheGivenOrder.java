class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            target.add(index[i],nums[i]);
        }
        int[] targetarr = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            targetarr[i]= target.get(i);
        }
        return targetarr;
    }
}