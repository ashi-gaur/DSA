//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            long n=Long.parseLong(in.readLine());
            Solution ob=new Solution();
            out.println(ob.findNumber(n));
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public long findNumber(long N)
    {
        long ans = 0 , num = 1;
        while(N != 0){
            if(N%5==0){
                ans += 9 * num;
               N = N/5 - 1;
            }
            else if(N%5==1){
                ans += 1 * num;
                N = N/5;
            }
            else if(N%5==2){
                 ans += 3 * num;
                 N = N/5;
            }
            else if(N%5==3){
                 ans += 5 * num;
                 N = N/5;
            }
            else if(N%5==4){
                 ans += 7 * num;
                 N = N/5;
            }
            num = num * 10;
        }
        return ans;
    }
}

