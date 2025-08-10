class Solution {
    public static int uglyNumber(int n) {
        long low = 1;
        long high = 2000000000;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = (mid / 2) + (mid / 3) + (mid / 5) - (mid / 6) - (mid / 10) - (mid / 15) + (mid / 30);
            if (count >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;  // cast to int because method returns int
    }
}
