class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0] = 0;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            left[i] = (temp + nums[i - 1]);
            temp = left[i];
        }
        temp = 0;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = (temp + nums[i + 1]);
            temp = right[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);

        }

        return ans;

    }
}