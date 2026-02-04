class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2;
        long oddPos = n / 2;

        long evens = pow(5, evenPos);
        long odds = pow(4, oddPos);

        return (int)((evens * odds) % MOD);
    }

    private long pow(long x, long n) {
        if (n == 0) return 1;

        long half = pow(x, n / 2);
        long res = (half * half) % MOD;

        if (n % 2 == 1) res = (res * x) % MOD;

        return res;
    }
}
