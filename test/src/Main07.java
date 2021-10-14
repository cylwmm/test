import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int len = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] num = new int[len];
            for(int j=0; j<len; j++){
                num[j] = Integer.parseInt(str[j]);
            }
            System.out.println(solve(num));
        }
    }
    public static long solve(int[] num){
        long max = 0;
        for(int i = 0; i< num.length; i++){
            long sum = num[i];
            int j = i + num[i];
            for(;j < num.length; j = j + num[j]){
                sum +=num[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}