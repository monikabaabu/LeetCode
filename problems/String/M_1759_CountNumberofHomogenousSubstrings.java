class Solution {
    public int countHomogenous(String s) {
        long MOD = 1_000_000_007;
        long ans = 0;
        long count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans = (ans + count * (count + 1) / 2) % MOD;
                count = 1;
            }
        }
        ans = (ans + count * (count + 1) / 2) % MOD;

        return (int) ans;
    }
}
