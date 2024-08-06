//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, b, n));
        }
	}
}

// } Driver Code Ends


//User function Template for Java



class Solution {

    public int minSum(int a[], int b[], int n) {
        // Initialize variables to hold minimum values and their indices
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int minAIndex = -1;
        int minBIndex = -1;

        
        for (int i = 0; i < n; i++) {
            if (a[i] < minA) {
                minA = a[i];
                minAIndex = i;
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (b[i] < minB) {
                minB = b[i];
                minBIndex = i;
            }
        }

        
        if (minAIndex != minBIndex) {
            return minA + minB;
        }

        
        int secondMinA = Integer.MAX_VALUE;
        int secondMinB = Integer.MAX_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (i != minAIndex && a[i] < secondMinA) {
                secondMinA = a[i];
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (i != minBIndex && b[i] < secondMinB) {
                secondMinB = b[i];
            }
        }

        
        return Math.min(minA + secondMinB, minB + secondMinA);
    }
}
