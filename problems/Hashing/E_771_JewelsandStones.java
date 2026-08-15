class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isJewell = new boolean[128];

        for (char c : jewels.toCharArray()) {
            isJewell[c] = true;
        }

        int count = 0;

        for (char c : stones.toCharArray()) {
            if (isJewell[c]) {
                count++;
            }
        }

        return count;
    }
}