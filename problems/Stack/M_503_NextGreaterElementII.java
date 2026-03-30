class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i= nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>=stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek();
            }
            else{
                ans[i] = -1;
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}