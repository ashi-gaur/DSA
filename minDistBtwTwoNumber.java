//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int indexX = -1;
        int indexY = -1;
        int minDistance = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==x) indexX = i;
            if(a[i]==y) indexY=i;
            if(indexX!=-1&& indexY!=-1) {
                if(Math.abs(indexX-indexY)<minDistance) minDistance = Math.abs(indexX-indexY);
            }
        }
        return minDistance==Integer.MAX_VALUE? -1: minDistance;
    }
}

