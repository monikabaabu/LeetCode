class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        for (int a : nums1) {
            set.add(a);
        }

        for (int b : nums2) {
            if (set.contains(b)) {
                set.remove(Integer.valueOf(b));
                set1.add(b);
            }
        }

        // Convert List<Integer> to int[]
        int[] array = new int[set1.size()];
        for (int i = 0; i < set1.size(); i++) {
            array[i] = set1.get(i);
        }

        return array;
    }
}
