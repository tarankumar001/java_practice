class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        if (n == 1 && k==1)
            return 1;
            if(k==0)return 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // if (nums[i - 1] + nums[i] == k || nums[i] == k) {
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

    }
}