# Question:
1. Given an array arr of N integers. Find the contiguous sub-array with maximum sum. Array may contain -ve elements [link](https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)

# Algo:
1. Iterate over array from index 0 to last (i)
2. Iterate over array from index i to last
<br>
	a. 
	```Java
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
	```

# Complexity:
greather then O(n * logn) less than O(n * n)