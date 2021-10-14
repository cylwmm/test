import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str1 = str.replaceAll(" ","");
        String[] arr = str.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0; i<l; i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (o1,o2)->(o2.getValue() - o1.getValue()));
        int min = str1.indexOf(list.get(0).getKey())+1;
        int max = str1.lastIndexOf(list.get(0).getKey()) + 1;
        int minLen = max - min;
        for(int i=1; i<list.size(); i++){
            if(list.get(i).getValue() < list.get(i-1).getValue()){
                break;
            }else{
                int mintmp = str1.indexOf(list.get(i).getKey())+1;
                int maxtmp = str1.lastIndexOf(list.get(i).getKey()) + 1;
                if(maxtmp - mintmp < minLen){
                    max = maxtmp;
                    min = mintmp;
                }
            }
        }
        System.out.println(min + " " + max);
    }
}