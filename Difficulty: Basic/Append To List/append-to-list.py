#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

#User function Template for python3

def appendToList(a,b,c):
    #Write the code below
    #Create a list
    #Append a b c in order
    #Return the list
    #Dont print here
    list1  = []
    list1.append(a)
    list1.append(b)
    list1.append(c)
    return list1


#{ 
 # Driver Code Starts.

def main():
    t=int(input())
    
    while(t>0):
        
        a=int(input())
        b=int(input())
        c=int(input())
        
        for x in (appendToList(a,b,c)):
            print(x,end=" ")
        print()
        t-=1

        print("~")
if __name__ == "__main__": 
    main()
# } Driver Code Ends