import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        System.out.println(nums(str, num));
    }
    public static int nums(String[] str, int num){
        int count = 1;
        for(int i=1; i<num; i++){
            if(!str[i].equals(str[i-1])){
                count++;
            }
        }
        return count / 2 +1;
    }
}
