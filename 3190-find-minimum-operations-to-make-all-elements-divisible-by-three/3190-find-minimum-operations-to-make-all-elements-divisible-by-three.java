class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if(n==1)return 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 != 0) {
                return n - 1;
            } else {
                return 0;
            }

        }
        return 0;

    }
}