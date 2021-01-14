# Question:
1. Move all negative elements to the left, while moving positive elements to the right of the array
2. [Link](https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/)

# Algo:
1. Traverse array 
	1. While traversing scan -ve elements and put them in a new array, keep track of index of the new array
2. Traver array
	2. While traversing scan +ve elements and put them in a new array, from the index obtained from last traversal
	
# Complexity:
1. O(n)