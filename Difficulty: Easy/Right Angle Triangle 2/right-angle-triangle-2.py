#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

#User function Template for python3
n = int(input())

for i in range(1, n + 1):
    if i == 1:
        print("*")
    elif i == n:
        print("* " * n)
    else:
        print("*" + " " * (2 * (i - 2) + 1) + "*")




#{ 
 # Driver Code Starts.

# } Driver Code Ends