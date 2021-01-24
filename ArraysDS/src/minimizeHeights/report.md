# Question:
1. Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower

# Approach:
1. Traverse through whole array, and calculate min and max
2. add k to min while subtracting k from max (subtract only if max >= k)
3. return the difference
4. This approach gave wrong answer

# Complexity:
O(n)