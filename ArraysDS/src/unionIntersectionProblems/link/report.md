# Question:
1. Remove duplicate elements from a sorted array and return an array with unique elements

# Algo:
1. create a new Array with same size as that of input array
2. fill the new array with -1
3. newArray[0] = inputArray[0]
4. i = 0, j = 0
5. Now run a loop and check if (newArray[j] != inputArray[i])
6. if true then, j++, then newArray[j] = inputArray[i]
7. return newArray, print only if newArray[i] is not -1

# Complexity:
O(n)