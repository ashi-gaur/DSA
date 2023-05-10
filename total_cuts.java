//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int n, int k, int[] arr) {
        // code here
        int[] maxL = new int[n];
        int[] minR = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            maxL[i] = max;
        }

        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, arr[i]);
            minR[i] = min;
        }

        for (int i = 0; i < n - 1; i++) {
            if ((maxL[i] + minR[i + 1]) >= k) {
                count++;
            }
        }
        return count;
    }
}
        
