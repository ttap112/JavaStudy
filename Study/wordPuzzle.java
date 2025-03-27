import java.util.Arrays;

public class wordPuzzle {
    private static final int INF = 20001; // 충분히 큰 값

    public static int wordPuzzleCount(String[] wordList, String word) {
        int n = word.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (String w : wordList) {
                if (i >= w.length() && word.startsWith(w, i - w.length())) {
                    dp[i] = Math.min(dp[i], dp[i - w.length()] + 1);
                }
            }
        }
        return dp[n] == INF ? -1 : dp[n];
    }

    public static void main(String[] args) {
        String[] wordList = {"ba", "na", "n", "a"};
        String word = "banana";
        System.out.println(wordPuzzleCount(wordList, word));
    }
}
