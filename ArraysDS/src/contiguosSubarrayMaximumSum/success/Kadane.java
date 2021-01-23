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
		//Kadane's algo works for all kinds of arrays except those
		//which contain only non-positive elements
		
		//check if array has all non-positive elements(0 & +ve)
		//if yes then return largest element of array
		int i = 0;
		int max = -2147483648;
		boolean isNonPositive = true;
		
		for(i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0 && isNonPositive == true) {
				
				isNonPositive = false;
				break;
			}
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}
		
		//if not, apply kadane's algo
		if(isNonPositive == true) {
			
			return max;
		} else {
			
			int maxSum = 0;
			int currSum = 0;
			
			for(i = 0; i < arr.length; i++) {
				
				currSum = currSum + arr[i];
				
				if(currSum < 0)
					currSum = 0;
				if(maxSum < currSum)
					maxSum = currSum;
			}
			return maxSum;
		}
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
