class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subset(nums, 0, new ArrayList<>(), list);
        return list;
    }

    private static void subset(int[] nums, int index, List<Integer> current, List<List<Integer>> list) {

        if (index == nums.length) {
            list.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subset(nums, index + 1, current, list);
        current.remove(current.size() - 1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        subset(nums, index + 1, current, list);
    }
}

//or

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subset(nums,0,new ArrayList<>(),list);

        return list;
    }
    private static void subset(int[] nums, int i,List<Integer> l, List<List<Integer>> list){
        list.add(new ArrayList<>(l));

        for (int k = i; k < nums.length; k++) {
            if (k > i && nums[k] == nums[k - 1]) {
                continue;
            }

            l.add(nums[k]);
            subset(nums, k + 1, l, list);
            l.remove(l.size() - 1);
        }
    }
}