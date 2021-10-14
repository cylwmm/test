import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int cost = 0;
        for (int i=0; i<n; i++){
            String[] value = br.readLine().split(" ");
            int x = Integer.parseInt(value[0]);
            int y = Integer.parseInt(value[1]);
            if(x > y) {
                cost = cost + (x - y); sum = sum +x;
            }else{
                cost  = cost; sum = sum + y;
            }
        }
        System.out.println(sum + " " + cost);
    }
}
