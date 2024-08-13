#User function Template for python3
class Solution:
    def merge(self, S1, S2):
        # code here
        output=""
        i,j=0,0
        while i<len(S1) or j<len(S2):
            if i<len(S1):
                output+=S1[i]
                i+=1
            if j<len(S2):
                output+=S2[j]
                j+=1
        return output


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        S1,S2 = map(str,input().strip().split())
        ob = Solution()
        print(ob.merge(S1, S2))
# } Driver Code Ends