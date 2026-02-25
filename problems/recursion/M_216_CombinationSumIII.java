class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        combination(k, n, list, new ArrayList<>(), 1);
        return list;
    }

    private static void combination(int k, int n, List<List<Integer>> list, List<Integer> l, int i) {

        if (n == 0 && l.size() == k) {
            list.add(new ArrayList<>(l));
            return;
        }

        if (n < 0 || l.size() > k || i > 9) {
            return;
        }

        for (int num = i; num <= 9; num++) {
            if (num > n) break;
            l.add(num);
            combination(k, n - num, list, l, num + 1);
            l.remove(l.size() - 1);
        }
    }
}



//or

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = new ArrayList<>();
        combination(arr,k,n,list,new ArrayList<>(),0);
        return list;
    }
    private static void combination(int[] arr, int k, int n, List<List<Integer>> list, List<Integer> l,int i){
        if(k==0 && n==0){
            list.add(new ArrayList<>(l));
            return;
        }
        if(i==arr.length || n<0){
            return;
        }
        l.add(arr[i]);
        combination(arr,k-1,n-arr[i],list,l,i+1);
        l.remove(l.size()-1);
        combination(arr,k,n,list,l,i+1);
    }
}