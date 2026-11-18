
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];                 // ASCII characters ke liye
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // max-heap: jiski frequency zyada, woh pehle
        PriorityQueue<Character> pq =
                new PriorityQueue<>((a, b) -> freq[b] - freq[a]);

        for (char c = 0; c < 128; c++) {
            if (freq[c] > 0) {
                pq.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            for (int k = 0; k < freq[c]; k++) {
                sb.append(c);                      // frequency jitni baar likho
            }
        }
        return sb.toString();
    }
}