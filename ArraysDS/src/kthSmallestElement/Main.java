package kthSmallestElement;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
	public String stringInput() {
		
		String output = null;
		
		InputStreamReader r = new java.io.InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		try {
			output = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
}
public class Main {
	
	//function to convert string to array
	public static int[] stringToArray(String array) {

		int stringLength = array.length();
		int arr[] = new int[stringLength];
		StringTokenizer st = new StringTokenizer(array);
		//logic to convert string to array
		int i = 0;
		while(st.hasMoreTokens()) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			System.out.println(arr[i]);
			i++;
		}
		return arr;
	}

	public static int kthsmallest(int[] arr, int l, int r, int k) {
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " 1st element of sorted array");
    	return arr[k - 1];
	}

	public static void main(String[] args) {
		
		Input in = new Input();
		// TODO Auto-generated method stub
		System.out.println("enter number of test cases:");
		int t = in.intInput(); //number of test cases
		
		for(int i = 0; i < t; i++) {
			
			System.out.println("enter size of array:");
			int n = in.intInput(); //size of array
			System.out.println("enter elements of array:");
			int arr[] = new int[n]; //array
			//input String and convert String to array
			String array = in.stringInput();
			//calling function to convert string to array
			arr = stringToArray(array);
			System.out.println("enter k:");
			int k = in.intInput(); //we have to find kth smallest element of an array

			System.out.println(kthsmallest(arr, 0, 0, k));
		}
		
	}

}
