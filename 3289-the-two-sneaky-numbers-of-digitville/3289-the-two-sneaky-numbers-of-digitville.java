class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int k = 0;
        Set<Integer> ans = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for (int num : nums) {
            if (ans.contains(num)) {
                dup.add(num);
            } else {
                ans.add(num);
            }
        }
        int[] result = new int[dup.size()];
        int i = 0;
        for (int num : dup) {
            result[i] = num;
            i++;

        }
        return result;

    }
}