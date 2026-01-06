class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> ans = new HashSet<>();

        for(int n : nums1){
            list.add(n);
        }
        for(int n:nums2){
            if(list.contains(n)){
                ans.add(n);
            }
        }
        int[] arr = new int[ans.size()];
        int i=0;
        for(int n:ans){
            arr[i]=n;
            i++;
        }
        return arr;
    }
}