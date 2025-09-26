class Solution {
    public int minOperations(int[] nums, int k) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
        }

        int rem = num % k;
        if (rem == 0) {
            return 0;

        } else {
            return rem;
        }
    }
}