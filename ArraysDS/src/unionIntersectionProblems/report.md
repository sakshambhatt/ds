# Question:
1. There was a confusion in this one. In excel sheet the question is "Find Union and intersection of two sorted arrays"
2. However, when clicked on the link, the question is "Given two arrays and their sizes, find the count of their union" [link](https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1)
3. So, I have decided to complete both questions with 1st one in MainSheet and 2nd one in MainLink.

# Algo:
#### Find intersection and union of 2 **sorted** arrays:
1.  Intersection Finder: (takes 2 arrays)
	a. Searches(binarySearch) for elements of 1 array in other, if found puts those elements in intersectionArray
2. Union Finder:(Takes 2 arrays and their intersection array)
	a. Searches(binarySearch) for elements of intersection array in one of the two given arrays, if found, it replaces element in input array with -1
	b. Fills unionArray with elements from 2 input arrays, ignoring (-1).
	
#### Find length of union array of 2 arrays(unsorted and with repeating elements):
1. Create a unionArray and fill it with elements from both input Arrays
2. Sort the unionArray
3. Declare a newArray of same size as that of unionArray
4. Put unique elements from unionArray into newArray only

# Complexity:
1. 
2. O(nlogn)