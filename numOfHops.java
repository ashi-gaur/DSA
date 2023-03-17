//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
       if(n==1)
           return 1;
       else if(n==2)
           return 2;
       else if(n==3)
           return 4;
       long A[]={1,2,4};
       
       for(int i=0;i<n-4;i++){
           A[i%3]=(A[0]+A[1]+A[2])%1000000007;
       }
       return (A[0]+A[1]+A[2])%1000000007;
    }
}


