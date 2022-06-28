# Question:

1. Given an array arr of N integers. Find the contiguous sub-array with maximum sum. Array may contain -ve elements [link](https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)

2. explanation: [Pepcoding youtube](https://www.youtube.com/watch?v=VMtyGnNcdPw&ab_channel=Pepcoding)

# Algo:

1. Check whether array has all non-positive elements, if yes then return max of array
2. Otherwise do the following
   run a loop:
   check if the element should start a new subarray: element > bufferSum + element
   or should go in the existing subarray

   change maxSum if bufferSum > maxSum

# Complexity:

O(n)
