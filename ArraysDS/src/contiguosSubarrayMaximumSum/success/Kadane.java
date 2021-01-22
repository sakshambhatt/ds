package contiguosSubarrayMaximumSum.success;

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
public class Kadane {
	
	public static int maxSubarraySum(int[] arr, int n) {
		
		int i = 0;
	
		int greatest = -2147483648; //lowest integer value of integer in Java
		int currSum = 0;
		//checking if the array has all non-positive elements (MaxSum = greatest element)
		//or if the array has all non-negative elements(MaxSum = sum of all)
		
		
		//Kadane's algo in case that the array has some non-positive
		//and some non-negative elements
		int maxSum = -2147483648;
		
		for(i = 0; i < arr.length; i++) {
			
			currSum = currSum + arr[i];
			if(maxSum < currSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return 0;
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
