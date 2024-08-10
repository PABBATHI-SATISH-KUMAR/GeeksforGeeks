//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int v[], int size)
    {
        // your code here
        // int n = v.length;

        // for (int i = 0; i < n; i++) {
        //     //selected element is v[i]
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         // counting the frequency of v[i]
        //         if (v[j] == v[i]) {
        //             cnt++;
        //         }
        //     }

        //     // check if frquency is greater than n/2:
        //     if (cnt > (n / 2))
        //         return v[i];
        // }
        // return -1;
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;

    }
}