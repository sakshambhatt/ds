# Question:
Given an array, find whether all elements are non-positive or non-negative or both non-positive and non-negative and if so, whether all of them are zero or not

# Approach:
1. Take 2 variables sum and zerocounter
2. Loop over aray
3. If element is +ve then sum = sum + 1 else if element is -ve then sum = sum - 1
4. if element is 0 then zeroCounter++
5. After looping over if sum is 0 but zeroCounter = ArrayLength then array is filled with zeroes
6. Otherwise it has both non-neg and non-pos and not all elements are zeroes
7. if sum is -ve and |sum| + zeroCounter  = arrayLength, then non-positive
8. else if sum is +ve and sum + zeroCounter = ArrayLength, then non-negative
8. else both non-positive and non-negative and not all elements are zeroes

# Complexity:
O(n)

# Test-cases
1. [1, 2, 3]
2. [1, 0, 2]
3. [-1, -2, -3]
4. [0, 0, 0]
5. [-1, 0, -2]
6. [1, - 6, 0]