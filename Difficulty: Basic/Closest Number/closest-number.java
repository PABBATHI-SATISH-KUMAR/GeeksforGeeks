//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int M = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.closestNumber(N, M));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int closestNumber(int n, int m) {
        int q = n / m;
        int n1 = m * q;

        int n2;
        if (n * m > 0) {
            n2 = m * (q + 1);
        } else {
            n2 = m * (q - 1);
        }

        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else if (Math.abs(n - n2) < Math.abs(n - n1)) {
            return n2;
        } else {
            return Math.abs(n1) > Math.abs(n2) ? n1 : n2;
        }
    }
};