//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
   static int missingNumber(int arr[], int size) {
        // Separate positive and non-positive numbers
        int shift = segregate(arr, size);
        
        // Consider only positive numbers in the array
        int[] positiveArr = new int[size - shift];
        int positiveSize = 0;
        for (int i = shift; i < size; i++) {
            positiveArr[positiveSize] = arr[i];
            positiveSize++;
        }
        
        // Mark presence of elements using array indices as hash keys
        for (int i = 0; i < positiveSize; i++) {
            int num = Math.abs(positiveArr[i]);
            if (num <= positiveSize) {
                positiveArr[num - 1] = -Math.abs(positiveArr[num - 1]);
            }
        }
        
        // Find the first index where the value is positive
        for (int i = 0; i < positiveSize; i++) {
            if (positiveArr[i] > 0) {
                return i + 1;
            }
        }
        
        // If all indices have negative values, return the next positive number
        return positiveSize + 1;
    }
    
    // Utility function to segregate positive and non-positive numbers
    static int segregate(int arr[], int size) {
        int i = 0;
        for (int j = 0; j < size; j++) {
            if (arr[j] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return i;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends
