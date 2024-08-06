//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(inputLine[i]));
            }

            Solution obj = new Solution();
            int[] product = obj.minAnd2ndMin(arr);
            if (product[0] == -1)
                System.out.println(product[0]);
            else
                System.out.println(product[0] + " " + product[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int a[]) {
        
        if (a == null || a.length < 2) {
            return new int[]{-1}; 
        }

        int[] ans = new int[2];
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        for (int i : a) {
            if (i < small1) {
                small2 = small1; 
                small1 = i;      
            } else if (i < small2 && i != small1) {
                small2 = i;
            }
        }

        
        if (small2 == Integer.MAX_VALUE) {
            return new int[]{-1}; 
        }

        ans[0] = small1;
        ans[1] = small2;
        return ans;
    }
}
