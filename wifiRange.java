//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
        int count=0, s=-1,e=-1;
        for(int i=0; i<N; i++){
            char ch = S.charAt(i);
            if(ch == '0'){
                count++;
            }
            else{
                if(s==-1){
                    s=i;
                    if(s > X) return false;
                }
                else{
                    if(count > 2*X) return false;
                }
                e=i;
                count=0;
            }
        }
        return ((e + X) >= (N-1));
    }
} 
