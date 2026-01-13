class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sort = nums.clone();
        Arrays.sort(sort);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(sort[i],i);
        }

        int[] res = new int[nums.length];

        for(int i=0;i<res.length;i++){
            res[i]= map.get(nums[i]);
        }
        return res;
    }
}