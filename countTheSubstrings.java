//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        int ans=0;
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            int lower=0,upper=0;
            for(int j=i;j<n;j++)
            {
                if( Character.isUpperCase(S.charAt(j)))
                    upper++;
                else
                    lower++;
                if(lower==upper) ans++;
            }
        }
        return ans;
    }
} 

