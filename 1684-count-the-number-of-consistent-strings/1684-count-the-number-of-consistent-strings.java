class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            int j;
            for (j = 0; j < words[i].length(); j++) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    break;
                }
            }
            if (j == words[i].length()) {
                count++;
            }
        }

        return count;
    }
}