class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;                       // naya character window mein aaya
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;                       // purana character window se bahar gaya
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}