//Given an array arr of N integers. Find the contiguous sub-array with maximum sum. 
//Array may contain -ve elements
package contiguosSubarrayMaximumSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Input {

	public String stringInput() {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		String output = null;

		try {
			output = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}

	public int intInput() {

		int output = Integer.parseInt(stringInput());
		return output;
	}

	public int[] stringToArray(int n) {

		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(stringInput());
		int i = 0;
		while (st.hasMoreTokens()) {

			a[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		return a;
	}
}

class Kadane {

	// Function to find subarray with maximum sum
	// arr: input array
	// n: size of array
	public static int maxSubarraySum(int arr[], int n) {

		int i = 0;
		int j = 0;
		int sum = 0;
		//numbers in array will be from -10^7 to 10^7
		//taking the lowest possible value
		int maxSum = -999999999;
		
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
		//System.out.println(maxSum);

		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array:");
		int n = in.intInput();
		System.out.println("enter array with spaces not newlines:");
		int arr[] = in.stringToArray(n);
		int maxSumOfSubarray = maxSubarraySum(arr, n);
		System.out.println(maxSumOfSubarray);
	}

}
