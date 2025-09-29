class Solution {
    public int[] shuffle(int[] nums, int n) {
        int n1 = nums.length;
        int[] ans = new int[n1];
        int index = 0;
        int j = n;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[j++];
        }
        return ans;
    }
}