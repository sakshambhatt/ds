//Given two arrays and their sizes, find the count of their union
package unionIntersectionProblems.link;

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

public class MainLink {

	// function which takes 2 arrays, their sizes
	// and returns the number of elements in their union
	public static int doUnion(int a[], int n, int b[], int m) {

		int unionCount = n + m;
		int i = 0;
		int j = 0;
		for (i = 0; i < a.length; i++) {

			for (j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					
					a[i] = -1;
					unionCount--;
				}
			}
		}
		for (i = 0; i < b.length; i++) {

			for (j = i + 1; j < b.length; j++) {

				if (b[i] == b[j]) {

					b[i] = -1;
					unionCount--;
				}
			}
		}
		for(i = 0; i < a.length; i++) {
			
			for(j = 0; j < b.length; j++) {
				
				if(a[i] != -1 && b[j] != -1) {
					
					if(a[i] == b[j]) {
						unionCount--;
					}
				}
			}
		}
		return unionCount;
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
