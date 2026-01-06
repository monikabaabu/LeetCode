class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int start = 0, end = target;
        long sum = 0L;
        while(start<end){
            int mid = start + (end-start)/2;
            sum = (long) mid * (mid + 1)/2;
            if(sum == target){
                return mid;
            }else if(sum > target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        sum = end * (end+1)/2;
        while((sum - target)%2 != 0){
            end++;
            sum = end * (end+1)/2;
        }
        return end;
    }
}
