//1. Input an array
//2. reverse it into an array and print it

package reverseArrray;

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
	
	public static void main(String[] args) {
		
		Input in = new Input();
		int buffer = 0;
		int i = 0;
		System.out.println("Enter size of array:");
		int size = in.intInput();
		int array[] = new int[size];
		
		System.out.println("enter elements of array:");
		for(i = 0; i < size; i++) {
			
			array[i] = in.intInput();
		}
		
		for(i = 0; i < size / 2; i++) {
			
			buffer = array[i];
			array[i] = array[size - (i + 1)];
			array[size - (i + 1)] = buffer;
		}
		System.out.println("reversed array:");
		for(i = 0; i < size; i++) {
			
			System.out.println(array[i]);
		}
	}
}
