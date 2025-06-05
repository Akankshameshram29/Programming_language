package DP;

public class WildCardMatching {
    private int memoization(String s, String p, int i, int j, int[][] dp) {
        if (i < 0 && j < 0) return 1;  // both strings are exhausted
        if (j < 0 && i >= 0) return 0; // pattern exhausted but s is not
        if (i < 0 && j >= 0) {         // s exhausted, check if p[0..j] are all '*'
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') return 0;
            }
            return 1;
        }

        if (dp[i][j] != -1) return dp[i][j];

        if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
            return dp[i][j] = memoization(s, p, i - 1, j - 1, dp);
        } else if (p.charAt(j) == '*') {
            // Convert OR logic to integer arithmetic: 1 if either is 1
            int matchZero = memoization(s, p, i, j - 1, dp);     // '*' matches 0 chars
            int matchMany = memoization(s, p, i - 1, j, dp);     // '*' matches 1+ chars
            return dp[i][j] = (matchZero == 1 || matchMany == 1) ? 1 : 0;
        }

        return dp[i][j] = 0;
    }
    private boolean Tabulation(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        // Base case initialization
         dp[0][0] = true;; // Both strings are empty
        for (int j = 1; j <= m; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1]; // '*' can match empty string
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}
