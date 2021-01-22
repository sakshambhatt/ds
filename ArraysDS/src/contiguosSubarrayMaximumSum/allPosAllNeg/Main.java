//Given an array, find if all elements are non-positive or non-negative
package contiguosSubarrayMaximumSum.allPosAllNeg;

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
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array:");
		int n = in.intInput();
		System.out.println("enter array elements with spaces not newlines:");
		int[] arr = in.stringToArray(n);
		
		
		
	}

}
