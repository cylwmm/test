import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Main1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Semaphore semaphore = new Semaphore(10);
        for (int i=1; i<=6; i++){
            new Thread(()->{
                try {

                    semaphore.acquire();
                }catch (Exception e){
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
        System.out.println();
    }
}
