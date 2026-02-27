
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b)->{
            int x = Integer.bitCount(a);
            int y = Integer.bitCount(b);
            if(x==y){
                return a-b;
            }
            return x-y;
        });
        for(int i=0;i<temp.length;i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}