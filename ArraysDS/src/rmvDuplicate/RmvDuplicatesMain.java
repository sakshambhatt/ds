//Remove duplicate elements from a sorted array 
//and return an array with unique elements
package rmvDuplicate;

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

public class RmvDuplicatesMain {
	
	//function which takes a sorted array with repeating elements and returns a distinct array
	public static int[] distinctArrayFinder(int[] a) {
		
		int newArray[] = new int[a.length];
		
		int i = 0;
		int j = 0;
		//filling newArray with -1
		for(i = 0; i < newArray.length; i++) {
			
			newArray[i] = -1;
		}
		
		//logic to put unique elements from [a] into newArray
		newArray[0] = a[0];
		for(i = 1, j = 0; i < a.length; i++) {
			
			if(newArray[j] != a[i]) {
				
				j++;
				newArray[j] = a[i];
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		
		Input in = new Input();
		System.out.println("enter size of array");
		int n = in.intInput();
		System.out.println("enter a sorted array w/ repeating elements (spaces not newline):");
		int array[] = in.stringToArray(n);
		int dArray[] = distinctArrayFinder(array);
		
		for(int i = 0; i < dArray.length; i++) {
			
			if(dArray[i] != -1) {
				
				System.out.print(dArray[i] + " ");
			}
		}
	}
}
