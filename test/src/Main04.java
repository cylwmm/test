import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        System.out.println(solve(a,b));
    }
    public static int solve(int a, int b){
        int count = 0;
        String strB = String.valueOf(b);
        for(int i=0; i<=a; i++){
            String str = String.valueOf(i);
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == strB.charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }
}
