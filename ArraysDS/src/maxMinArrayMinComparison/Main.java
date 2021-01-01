//1. Input an array
//2. Find minimum and maximum from that array with minimum number of comparisons
//3. Assumption: entered numbers are whole numbers
package maxMinArrayMinComparison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {
	public int intInput() {
		
		int output = 0;
		InputStreamReader r = new java.io.InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		try {
			output = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return output;
	}
}
public class Main {
	
	public static int[] maxMinFinder(int arr[]) {
		
		//0th index is min, 1st one is max
		int maxMin[] = {arr[0], arr[0]};
		
		for(int i = 1; i < arr.length; i++) {
			
			if(maxMin[1] < arr[i]) {
				maxMin[1] = arr[i];
			}
			if(maxMin[0] > arr[i]) {
				maxMin[0] = arr[i];
			}
		}
		
		return maxMin;
	}
	public static void main(String[] args) {
		
		int i = 0;
		Input in = new Input();
		System.out.println("enter size of array:");
		int size = in.intInput();
		int array[] = new int[size];
		System.out.println("enter elements of array:");
		for(i = 0; i < size; i++) {
			
			array[i] = in.intInput();
		}
		int output[] = maxMinFinder(array);
		System.out.println("max: " + output[1] + "\n" + "min: " + output[0]);
	}
}
