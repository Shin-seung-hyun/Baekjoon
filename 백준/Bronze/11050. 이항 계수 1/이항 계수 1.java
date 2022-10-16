import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        
        dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    static int factorial(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = n * factorial(n - 1);
    }
}
