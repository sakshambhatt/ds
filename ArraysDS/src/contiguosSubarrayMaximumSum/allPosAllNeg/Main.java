//Given an array, find if all elements are non-positive or non-negative
package contiguosSubarrayMaximumSum.allPosAllNeg;

import java.lang.Math;
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
public class Main {
	//function which takes an array and returns whether it is
	//non-positive or non-negative or (non-positve and non-negative)
	//if non-positve and non-negative whether all elements are zeroes
	public static String arraySignFinder(int arr[]) {
		
		int i = 0;
		int sum = 0;
		int zeroCounter = 0;
		for(i = 0; i < arr.length; i++) {
			
			if(arr[i] < 0) 
				sum--;
			else if(arr[i] > 0)
				sum++;
			else if(arr[i] == 0)
				zeroCounter++;
		}
		
		if(sum == 0) {
			
			if(zeroCounter == arr.length) {
				
				return "Filled with zeroes";
			} else {
				
				return "both non-negative and non-positve and not all are zeroes";
			}
		} else {
			
			if(sum < 0 && Math.abs(sum) + zeroCounter == arr.length) {
				
				return "all non-positive numbers";
			} else if(sum > 0 && Math.abs(sum) + zeroCounter == arr.length) {
				
				return "all non-negative numbers";
			} else {
				
				return "both non-negative and non-positve and not all are zeroes";
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array:");
		int n = in.intInput();
		System.out.println("enter array elements with spaces not newlines:");
		int[] arr = in.stringToArray(n);
		System.out.println(arraySignFinder(arr));
		
		
	}

}
