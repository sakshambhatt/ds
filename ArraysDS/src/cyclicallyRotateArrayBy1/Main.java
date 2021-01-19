//cyclically rotate an array by 1
package cyclicallyRotateArrayBy1;

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

	public long longInput() {

		long output = Long.parseLong(stringInput());
		return output;
	}

	public long[] stringToArray(long n) {

		long a[] = new long[(int) n];
		StringTokenizer st = new StringTokenizer(stringInput());
		int i = 0;
		while (st.hasMoreTokens()) {

			a[i] = Long.parseLong(st.nextToken());
			i++;
		}
		return a;
	}
}
public class Main {
	
	//function which takes an array and cyclically rotates it by 1
	public static long[] rotate(long arr[], long n) {
		
		long buffer = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; i--) {
			
			arr[i] = arr[i - 1];
		}
		arr[0] = buffer;
		return arr;
	}
	public static void main(String[] args) {
		
		Input in = new Input();
		System.out.println("enter size of array:");
		long n = in.longInput();
		System.out.println("enter array(with spaces not newlines):");
		long array[] = in.stringToArray(n);
		//calling the function
		array = rotate(array, n);
		//printing the rotated array
		System.out.println("rotated array");
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}
	}

}
