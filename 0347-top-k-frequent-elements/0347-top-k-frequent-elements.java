class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int word : nums) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>(map.keySet());
        ans.sort((a, b) -> map.get(b) - map.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {

            result[i] = ans.get(i);
        }
        return result;

    }
}