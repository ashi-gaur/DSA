//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        // code here
        String ans = "";
        int i = 1;
        ans += str.charAt(0) + "";
        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i-1)) break;
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(0)) 
                break;
            ans += str.charAt(i) + "";
        }
        return ans + rev(ans);
    }
    private static String rev(String str) {
        String ans = "";
        for (char ch : str.toCharArray()) ans = ch + ans;
        return ans;
    }
}
        
