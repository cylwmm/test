import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arrs = new int[n];
        for(int i=0; i<n; i++){
            arrs[i] = Integer.parseInt(str[i]);
        }
        long res = 0;
        for (int i=1; i<n; i++){
            long sum=0;
            for(int j=1; j<=i;j++){
                if(arrs[i] > arrs[j-1]){
                    if(arrs[j] == arrs[j-1]){
                        continue;
                    }
                    sum++;
                }
            }
            res += sum;
        }
        System.out.println(res);
    }
}
