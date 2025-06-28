#User function Template for python3

class Solution:
    def segregateElements(self, arr):
        temp = []
        for i in range(len(arr)):
            if arr[i] >= 0:
                temp.append(arr[i])
        for i in range(len(arr)):
            if arr[i] < 0:
                temp.append(arr[i])
        for i in range(len(arr)):
            arr[i] = temp[i]
