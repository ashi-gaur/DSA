//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long N){
        // code here
       int n=(int)N;
       int m = 1000000007;
       int arr[]=new int[n+1];
       arr[0] = 0;
       arr[1] = 1;
       for(int i=2; i<=n; i++) {
           arr[i] = (arr[i-2] + arr[i-1])%m;
       }
       return arr[n];
   }
}
