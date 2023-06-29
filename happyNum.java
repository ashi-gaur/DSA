//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    static int nextHappy(int N){
        // code here
        for(int i=N+1;i<Integer.MAX_VALUE;i++){
             if(happy(i)) return i;
        }
        return 0;
    }
    static boolean happy(int n){
        if(n==1)return true;
        if(valid(n)==1 || valid(n)==7){
            return true;
        }
        return false;
    }
    static int valid(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        if(sum<10) return sum;
        return valid(sum);
    }
}
