class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int totalShift = 0;
        char[] arr = s.toCharArray();

        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            arr[i] = (char) ('a' + (arr[i] - 'a' + totalShift) % 26);
        }

        return new String(arr);
    }
}
