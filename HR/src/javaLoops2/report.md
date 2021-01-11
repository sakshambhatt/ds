# About question:
1. [Loops2 on HackerRank](https://www.hackerrank.com/challenges/java-loops/problem)
2. A simple question which takes 4 inputs and asks to print a series in which term t = (a + (2^0) * b + ... + (2^(n - 1) * b))  
	1. q: number of queries (number of a, b, n inputs that will be entered)
	2. a: a in term 't'
	3. b: b in term 't'
	4. n: n is number of terms to print
	
# Status:
## NullPointerException:
Exception in thread "main" java.lang.NullPointerException
	at java.util.StringTokenizer.<init>(StringTokenizer.java:199)
	at java.util.StringTokenizer.<init>(StringTokenizer.java:236)
	at Solution.seriesCalulator(Solution.java:42)
	at Solution.main(Solution.java:86