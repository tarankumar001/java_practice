class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int j = 0;
            int count = 0;
            while (j < n) {
                if (i != j && nums[i] > nums[j]) {
                    count++;

                }
                j++;

            }
            result[i] = count;

        }
        return result;

    }
}