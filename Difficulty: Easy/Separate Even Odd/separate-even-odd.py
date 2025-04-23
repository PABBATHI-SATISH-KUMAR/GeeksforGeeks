#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

#User function Template for python3


def evenOdd(arr):
    even = []
    odd = []

    #Write your code below to append odd elements in numbers to odd list
    #Write your code below to append even elements in numbers to even list
    even = list(filter(lambda x:(x&1)==0,arr))
    odd = list(filter(lambda x:(x&1)!=0,arr))
    return (even, odd)  #This is the return statement



#{ 
 # Driver Code Starts.

if __name__ == '__main__':
    
    t= int(input())
    
    for _ in range(t):
        
        numbers = numbers=[int(x) for x in input().strip().split()]

        
        even,odd = evenOdd(numbers)
        
        print(*even)
        print(*odd)
        print("~")
# } Driver Code Ends