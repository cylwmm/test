import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] money = new int[]{1,5,10,20,50,100};
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=0; i<n; i++){
            for (int j=money[i]; j < money.length; j++){
                if (j<=n){
                    dp[j] += dp[j-money[i]];
                }
            }
        }
        System.out.println(dp[n]);
    }
}
