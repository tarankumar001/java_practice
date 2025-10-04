class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int ans = x % 10;
            res = res * 10 + ans;
            x = x / 10;

        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int) res;

    }
}