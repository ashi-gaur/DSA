//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public void dfs_numIslands(char[][] grid, int sr, int sc, int[][] dir) {
       grid[sr][sc] = '0';
       for(int[] d : dir) {
           int r = sr + d[0];
           int c = sc + d[1];
           
           if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == '1')
               dfs_numIslands(grid, r, c, dir);
       }
   }
   public int numIslands(char[][] grid) {
       int n = grid.length, m = grid[0].length;
       int[][] dir = {{1, 0}, {0,1}, {-1, 0}, {0, -1}, {1, -1}, {-1, 1}, {1, 1}, {-1, -1}};
       int numOfIslandCount = 0;
       for(int i = 0; i < n; i++) {
           for(int j = 0; j < m; j++) {
               if(grid[i][j] == '1') {
                   numOfIslandCount++;
                   dfs_numIslands(grid, i, j, dir);
               }
           }
       }
       return numOfIslandCount;
   }
}
