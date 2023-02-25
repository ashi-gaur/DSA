//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
                if(n<3){

            return false;

        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){

            arr[i]=arr[i]*arr[i];

        }

        for(int i=n-1; i>=0;i--){

            int j=0;

            int k=i-1;

            while(j<k){

                if(arr[j]+arr[k]==arr[i]){

                    return true;

                }

                if(arr[j]+arr[k]>arr[i]){

                    k--;

                }else{

                    j++;

                }

            }

        }

        return false;
    }
}