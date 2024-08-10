//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int l = Integer.parseInt(read.readLine());
            int r = Integer.parseInt(read.readLine());
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            // int[] arr = new int[array1.size()];
            // int idx = 0;
            // for (int i : array1) arr[idx++] = i;

            v = new Solution().reverseSubArray(array1, l, r);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java



class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        // Convert 1-based indexing to 0-based indexing
        l--; 
        r--;

        // Reverse the subarray from index l to r
        while (l < r) {
            // Swap the elements at index l and r
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);

            // Move towards the middle
            l++;
            r--;
        }
        
        return arr;
    }
}