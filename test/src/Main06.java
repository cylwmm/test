import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            res[i] = solve(x);
        }
        for (int i=0; i<n; i++){
            System.out.println(res[i]);
        }
    }
    public static int solve(int x){
        for(int i = 1; i<Integer.MAX_VALUE; i++){
            int z = 1;
            int w = i;
            for (int j=1; j<Math.sqrt(i);j++){
                if(i % j == 0){
                    if(j - z > x || i /j - w >x){
                        return i-1;
                    }
                    z = j;
                    w = i /j;
                }
            }
        }
        return 0;
    }
}
