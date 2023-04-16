//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int res = 0;
        int dp[][] = new int[n][m];
        for(int r[] : dp) Arrays.fill(r, -1);
        for(int i =0;i<n;i++){
            res = Math.max(res, solve(i, m-1, M, dp));
        }
        return res;
    }
    static int solve(int row, int col, int arr[][], int[][] dp)
    {
        if(row<0 || row>=arr.length) return Integer.MIN_VALUE;
        if(col < 0){
            return 0;
        }
        if(dp[row][col] != -1) return dp[row][col];
        int a = 0, b = 0, c = 0;
        a = solve(row-1, col-1, arr, dp);
        b = solve(row, col-1, arr, dp);
        c = solve(row+1, col-1, arr, dp);
        return dp[row][col] = Math.max(a, Math.max(b, c))+arr[row][col];
    }
}


