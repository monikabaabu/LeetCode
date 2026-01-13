class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for(int n: arr1){
            list.add(n);

        }
        int[] ans = new int[arr1.length];
        int idx=0;
        for(int i=0;i<arr2.length;i++){
            while(list.contains(arr2[i])){
                ans[idx++]=arr2[i];
                list.remove(Integer.valueOf(arr2[i]));
            }
        }
        Collections.sort(list);
        int i2=ans.length-1;
        for(int i=list.size()-1;i>=0;i--){
            ans[i2--]=list.get(i);
        }
        return ans;
    }
}
//or solution 2

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int n : arr1){
            count[n]++;
        }
        int i2=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]-->0){
                arr1[i2++] = arr2[i];
            }
        }
        for(int i=0;i<=1000;i++){
            while(count[i]-->0){
                arr1[i2++] = i;
            }
        }
        return arr1;
    }
}