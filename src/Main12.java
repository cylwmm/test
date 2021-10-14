import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n=Integer.parseInt(str1[0]);
        double p = Double.parseDouble(str1[1]) / 100;
        double q = Double.parseDouble(str1[2]) / 100;
        String[] str2 = br.readLine().split(" ");
        double[] arrs = new double[n];
        long res = 0;
        for(int i=0; i<n; i++){
            arrs[i] = Double.parseDouble(str2[i]);
        }
        Arrays.sort(arrs);
        double[] grade = new double[n];
        grade[n-1] = 100;
        for(int i=n-2; i>=0; i--) {
            grade[i] = grade[i+1] - ((arrs[i+1] - arrs[i]) >0?1:0);
        }

        for (int i=n-1; i>=0; i--){
            if(p*grade[i] + q*arrs[i] >= 60.0){
                res++;
            }else if(grade[i] > grade[i-1]) {
                break;
            }
        }
        System.out.println(res);
    }
}
