import java.util.*;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int best = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            best = Math.max(best, largestInHistogram(height));
        }

        return best;
    }

    private int largestInHistogram(int[] h) {
        int m = h.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= m; i++) {
            int curr = (i == m) ? 0 : h[i];

            while (!st.isEmpty() && curr < h[st.peek()]) {
                int height = h[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();
                int width = i - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            if (i < m) {
                st.push(i);
            }
        }

        return maxArea;
    }
}