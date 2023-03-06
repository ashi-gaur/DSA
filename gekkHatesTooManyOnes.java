//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
        // code here
        int cnt = 0;
        int ans = 0;
        for(int i=31; i>=0; i--)
        {
            int bit = (n>>i)&1;
            
            if(bit==1) cnt++;
            else cnt = 0;
            
            if(cnt==3)
            {
                cnt=0;
            }
            else
            {
                ans = ans | (bit<<i);
            }
        }
        
        return ans;
        
    }
}
        
