//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int n = A.length();
        StringBuilder sb =new StringBuilder("");
        for(int j=0; j<n; j++){
            char ch = A.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
                while(i<=j &&  map.get(A.charAt(i)) > 1 ) i++;
            }else map.put(A.charAt(j), 1);
            
            if(i<=j) sb.append(A.charAt(i));
            else sb.append('#');
        }
        return sb.toString();
    }
}
