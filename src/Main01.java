import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        double sum = 0;
        double nums = 0;
        for(int i=0; i<str.length; i++){
            nums += Double.parseDouble(str[i]);
            sum += (i+1)*Double.parseDouble(str[i]);
        }
        DecimalFormat to= new DecimalFormat("#.0");
        double result =sum/nums;
        String res = to.format(result);
        System.out.println(res);
    }
}

