class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String sim : operations) {
            if (sim.equals("++X") || sim.equals("X++")) {
                x++;

            } else {
                x--;
            }
        }
        return x;

    }
}