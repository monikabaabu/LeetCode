class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        for(int n : nums) set.add(n);
        for(int n: set){
            if(!set.contains(n-1)){
                int c=1;
                int curr = n;
                while(set.contains(curr+1)){
                    c++;
                    curr++;
                }
                max = Math.max(c,max);
            }
        }
        return max;
    }
}