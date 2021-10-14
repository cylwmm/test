import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        Deque<Character> deque = new ArrayDeque<>();
        for (int i=0; i< str2.length(); i++){
            deque.add(str2.toCharArray()[i]);
        }
        long sum = 0;
        int it = 4;
        while (!deque.isEmpty()){
            for (int i=0; i<str1.length(); i++){
                if (!deque.isEmpty()){
                    if (str1.toCharArray()[i] == deque.peek()){
                        deque.poll();
                    }else{
                        sum++;
                    }
                }
            }
            it--;
            if(it==0){
                break;
            }
        }
        if(it==0){
            System.out.println(0);
        }else {
            System.out.println(sum);
        }
    }
}

