class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for (int val : nums) {
            if (ans.contains(val)) {
                return true;
            } else
                ans.add(val);
        }
        return false;

    }
}