class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int expected = 1;
        for (int i = 0; i < nums.length; i++) {
            while (expected < nums[i]) {
                list.add(expected);
                expected++;
            }
            if (nums[i] == expected) {
                expected++;
            }
        }
        while (expected <= nums.length) {
            list.add(expected);
            expected++;
        }
        return list;
    }
}
