import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]), X = Integer.parseInt(str1[1]);
        String[] prices = br.readLine().split(" ");
        int[] dp = new int[X+1];
        Arrays.fill(dp,100001);
        dp[0] = 0;
        for(int i=0; i<n; i++){
            int price = Integer.parseInt(prices[i]);
            for(int j=X; j>=1; j--){
                if (price < j){
                    dp[j] = Math.min(dp[j], dp[j - price] + price);
                }else {
                    dp[j] = Math.min(dp[j], price);
                }
            }
        }
        System.out.println(dp[X]);
    }
}
