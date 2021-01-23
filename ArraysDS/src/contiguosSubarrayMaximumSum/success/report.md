# Question:
1. Given an array arr of N integers. Find the contiguous sub-array with maximum sum. Array may contain -ve elements [link](https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)

# Algo:
1. Check whether array has all non-positive elements, if yes then return max of array
2. Otherwise do the following
'''Java
//logic to calculate sum of contigous subArray
for(i = 0; i < arr.length; i++) {
			
	sum = 0;
	for(j = i; j < arr.length; j++) {
				
		sum = sum + arr[j];
		if(sum > maxSum) {
					
			maxSum = sum;
		}
	}
}
'''

# Complexity:
O(n)