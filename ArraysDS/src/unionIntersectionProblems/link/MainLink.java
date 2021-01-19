//Given two arrays and their sizes, find the count of their union
package unionIntersectionProblems.link;

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

public class MainLink {

	// function which takes 2 arrays, their sizes
	// and returns the number of elements in their union
	public static int doUnion(int a[], int n, int b[], int m) {

		int i = 0;
		int j = 0;
		int[] unionArray = new int[n + m];
		// filling elements of a in unionArray
		for (i = 0; i < a.length; i++) {

			unionArray[j] = a[i];
			j++;
		}
		// filling elements of b in unionArray
		for (i = 0; i < b.length; i++) {

			unionArray[j] = b[i];
			j++;
		}

		// sorting array
		Arrays.sort(unionArray);

		// logic to remove repeating elements from an array starts
		int newArray[] = new int[unionArray.length];

		// logic to put unique elements from [unionArray] into newArray
		newArray[0] = unionArray[0];
		for (i = 1, j = 0; i < unionArray.length; i++) {

			if (newArray[j] != unionArray[i]) {

				j++;
				newArray[j] = unionArray[i];
			}
		}
		// logic to remove repeating elements from an array ends
//		System.out.println("\nunion array");
//		for (i = 0; i < newArray.length; i++) {
//
//			if(newArray[i] != -1) {
//				
//				System.out.print(newArray[i] + " ");
//			}
//		}
//		System.out.println("\n" + (j + 1));
		// j was counting unique elements and (j + 1) because we did newArray[0] =
		// unionArray[0]; at line 83
		return j + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array1:");
		int n = in.intInput();
		System.out.println("enter array1 (with spaces not newLines in between):");
		int a[] = in.stringToArray(n);
		System.out.println("enter size of array2:");
		int m = in.intInput();
		System.out.println("enter array2 (with spaces not newLine in between):");
		int b[] = in.stringToArray(m);
		int sizeOfUnion = doUnion(a, n, b, m);
		System.out.println(sizeOfUnion);
	}
}
