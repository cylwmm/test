import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int[] work = new int[n+1];
        int[] play = new int[n+1];
        for(int i=1; i<n+1; i++){
            work[i] = Integer.parseInt(arr1[i-1]);
            play[i] = Integer.parseInt(arr2[i-1]);
        }
        int[][] dp = new int[n+1][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i=1; i<n+1; i++){
            if (work[i] == 1){
                dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + 1;
            }
            if(play[i] == 1){
                dp[i][2] =  Math.max(dp[i-1][0], dp[i-1][1]) + 1;
            }
            dp[i][0] =Math.max(dp[i-1][0],Math.max(dp[i-1][1], dp[i-1][2]));
        }
        int res = n - Math.max(dp[n][0],Math.max(dp[n][1], dp[n][2]));
        System.out.println(res);
    }
}