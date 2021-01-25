# Question:
Take a number between 1 and 1000, and convert it to Roman numeral.

# Approach:
1. Store references 1 = I, 4 = IV,..., 1000 = M in an array at corresponding indices. 4 = IV, so "IV" will be stored at arr[4]
2. Store all the keys in an array
3. for i -> 1000 - 1, check if the remainder of num % key is less than num
4. if it is, then 
```Java
				appendCount = num / key[i];
				for(j = 0; j < appendCount; j++) {
					
					sb.append(romanReference[key[i]]);
				}
				num = num % key[i];
```

# Analysis:
O(n ^ 2)