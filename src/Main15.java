import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().trim().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);
        char[][] grid = new char[n][m];
        for(int i = 0; i < n; i++)
            grid[i] = br.readLine().trim().toCharArray();
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                if(grid[i][j] != '0') {
                    count ++;
                    dfs(grid, i, j, grid[i][j]);
                }
        }
        System.out.println(count);
    }

    private static void dfs(char[][] grid, int x, int y, char influence) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || grid[x][y] != influence)
            return;
        grid[x][y] = '0';
        dfs(grid, x + 1, y, influence);
        dfs(grid, x - 1, y, influence);
        dfs(grid, x, y + 1, influence);
        dfs(grid, x, y - 1, influence);

    }
}