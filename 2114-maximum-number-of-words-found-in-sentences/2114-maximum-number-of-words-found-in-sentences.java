class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int max = 0;
        for (String words : sentences) {
            String[] word = words.split(" ");
            max = Math.max(max, word.length);
        }
        return max;
    }
}