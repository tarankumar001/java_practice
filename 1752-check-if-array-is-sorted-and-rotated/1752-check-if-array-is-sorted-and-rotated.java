class Solution {
    public boolean check(int[] nums) {
        int low = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[(i + 1) % nums.length])
                low++;
        }
        return low <= 1;

    }
}