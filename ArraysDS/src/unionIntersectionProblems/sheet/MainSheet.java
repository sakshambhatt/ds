//Find Union and intersection of two sorted arrays
package unionIntersectionProblems.sheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

public class MainSheet {

	// function which takes intersection array of two arrays and those two arrays
	// and returns the union array
	public static int[] unionFinder(int[] intersection, int a[], int b[]) {

		int foundAtIndex = -1;
		int i = 0;
		int j = 0;
		for (i = 0; i < intersection.length; i++) {
			
			//array is sorted, so binarySearch is more efficient
			foundAtIndex = Arrays.binarySearch(a, intersection[i]);
			if (foundAtIndex > -1) {
				a[foundAtIndex] = -1;
			}
		}

		int unionArray[] = new int[a.length + b.length];
		for (i = 0; i < unionArray.length; i++) {
			unionArray[i] = -1;
		}
		for (i = 0, j = 0; i < a.length; i++) {

			if (a[i] != -1) {
				unionArray[j] = a[i];
				j++;
			}
		}
		for (i = 0; i < b.length; i++) {

			if (b[i] != -1) {
				unionArray[j] = b[i];
				j++;
			}
		}
//		System.out.println("array A");
//		for(i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
//		System.out.println("\narray B");
//		for(i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
//		System.out.println("\nunion array:");
//		for(i = 0; i < unionArray.length; i++) {
//			
//			if(unionArray[i] != -1) {
//				System.out.print(unionArray[i] + " ");
//			}
//		}
		return unionArray;
	}

	// function which takes 2 sorted arrays one small and one large (or both equal)
	// and returns intersection array of the two
	public static int[] intersectionFinder(int small[], int large[]) {

		int i = 0;
		int j = 0;
		int intersection[] = new int[small.length];
		// filling intersection array with -1
		for (i = 0; i < intersection.length; i++) {
			intersection[i] = -1;
		}

		// logic to find the intersection of the two array
		for (i = 0, j = 0; i < small.length; i++) {

			// arrays are sorted. hence, binary search is more efficient than linear search
			int foundAtIndexInLarge = Arrays.binarySearch(large, small[i]);
			if (foundAtIndexInLarge > -1) {

				intersection[j] = small[i];
				j++;
			}
		}

//		System.out.println("small array");
//		for(i = 0; i < small.length; i++) {
//			System.out.print(small[i] + " ");
//		}
//		System.out.println("\nlarge array:");
//		for(i = 0; i < large.length; i++) {
//			System.out.print(large[i] + " ");
//		}
//		System.out.println("");

		return intersection;
	}

	// function to assign smaller array to 'small' variable and larger to 'large'
	// and to call intersection finder function
	public static int[] smallLargeSeparatorAndIntersectionCaller(int a[], int b[]) {

		if (a.length < b.length) {
			int small[] = a;
			int large[] = b;
			return intersectionFinder(small, large);
		} else {
			int small[] = b;
			int large[] = a;
			return intersectionFinder(small, large);
		}
	}

	public static void main(String[] args) {

		// Input
		Input in = new Input();
		int i = 0;
		System.out.println("enter size of array1:");
		int n = in.intInput();
		System.out.println("enter array1 (with spaces in between not newLine):");
		int a[] = in.stringToArray(n);
		System.out.println("enter size of array2 (with spaces in between not newLine):");
		int m = in.intInput();
		System.out.println("enter array2:");
		int b[] = in.stringToArray(m);

		// calling function which separates large and small arrays and calls
		// intersection finder function
		int intersectionArray[] = smallLargeSeparatorAndIntersectionCaller(a, b);

		// calling union finder function
		int unionArray[] = unionFinder(intersectionArray, a, b);

		// print intersection array
		System.out.println("intersection array:");
		for (i = 0; i < intersectionArray.length; i++) {

			if (intersectionArray[i] > -1) {
				System.out.print(intersectionArray[i] + " ");
			}
		}
		//print union array
		System.out.println("\nunion array:");
		for(i = 0; i < unionArray.length; i++) {
			
			if(unionArray[i] != -1) {
				System.out.print(unionArray[i] + " ");
			}
		}
	}

}
