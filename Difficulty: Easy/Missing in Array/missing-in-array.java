class Solution {
    int missingNum(int a[]) {
        // code here
        int n = a.length + 1;  
        long expectedSum = (long)n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }

        return (int)(expectedSum - actualSum);
    }
}