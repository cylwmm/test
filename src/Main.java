import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class UnionFind {
    public static int[] parent = new int[10000001];
    public static int[] personNums = new int[10000001];
    public UnionFind(){
        for(int i = 1; i <= 10000000; i++){
            parent[i] = i;
            personNums[i] = 1;
        }
    }

    public int find(int x) {
        while(x != parent[x]){
            parent[x] = parent[parent[x]];    // 路径压缩
            x = parent[x];
        }
        return x;
    }

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY) return;
        parent[rootY] = rootX;
        personNums[rootX] += personNums[rootY];
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T -- > 0){
            int n = Integer.parseInt(br.readLine());
            UnionFind uf = new UnionFind();
            for(int i = 0; i < n; i++){
                String[] params = br.readLine().trim().split(" ");
                int x = Integer.parseInt(params[0]);
                int y = Integer.parseInt(params[1]);
                uf.union(x, y);
            }
            int max = 0;
            for(int i = 1; i < uf.personNums.length; i++)
                max = Math.max(max, uf.personNums[i]);
            System.out.println(max);
        }
    }
}