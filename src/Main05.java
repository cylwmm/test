import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main05 {

    static boolean[][] visit;
    static int[] sv;
    static int[] tv;
    static ArrayList<Integer>[] graph;

    public static void main(String[] ags) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        sv = new int[n+1];
        tv = new int[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i=0; i<m; i++){
            str1 = br.readLine().split(" ");
            int u = Integer.parseInt(str1[0]), v = Integer.parseInt(str1[1]);
            graph[u].add(v);
        }
        for(int i=1; i<=n; i++){
            bfs(i);
        }
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (visit[i][j]){
                    sv[i]++;
                    tv[j]++;
                }
            }
        }
        int res = 0;
        for (int i=1; i<=n; i++){
            if (tv[i] > sv[i]) res++;
        }
        System.out.println(res);
    }
    private static void bfs(int i){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visit[i][i] = true;
        while (!queue.isEmpty()){
            int cur = queue.poll();
            for (Integer e:graph[cur]){
                if (!visit[i][e]){
                    visit[i][e] = true;
                    queue.add(e);
                }
            }
        }
    }
}
