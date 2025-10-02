class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n = height.length;
        ArrayList<Integer> stable = new ArrayList<>();
        for (int i = 1; i < n; ++i) {
            if (height[i - 1] > threshold) {
                stable.add(i);
            }
        }
        return stable;

    }
}