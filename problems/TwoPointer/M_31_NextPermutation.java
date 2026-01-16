class Solution {
    public void nextPermutation(int[] nums) {
        int i = -1;
        for (int j = nums.length - 2; j >= 0; j--) {
            if (nums[j] < nums[j + 1]) {
                i = j;
                break;
            }
        }
        if (i < 0) {
            reverse(nums, 0, nums.length - 1);
        }
        else {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
            reverse(nums, i + 1, nums.length - 1);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
