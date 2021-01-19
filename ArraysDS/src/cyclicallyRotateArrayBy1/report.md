# Question:
1. Cyclically rotate an array by 1

# Algo:
1. buffer = last element of array
2. 
```Java
for(i = lastIndexOfArray; i > 0; i--) {
	a[i] = a[i - 1];
}
a[0] = buffer;
```

# Complexity:
O(n)