//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
  if(N%groupSize !=0) return false;
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        Arrays.sort(hand);
        
        for(int i=0;i<hand.length;i++){
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        
        for(int i=0;i<hand.length;i++){
            if(hm.containsKey(hand[i])){
                if(hm.get(hand[i])>1) hm.put(hand[i],hm.get(hand[i])-1);
                else hm.remove(hand[i]);
                
                int count=1;
                int nextVal=hand[i]+1;
                while(count<groupSize){
                    if(hm.containsKey(nextVal)){
                        count++;
                        
                        if(hm.get(nextVal)>1) hm.put(nextVal,hm.get(nextVal)-1);
                        else hm.remove(nextVal);
                        
                        nextVal++;
                        
                    }
                    else return false;
                }
            }
        }
        
        return  true;    }
}
