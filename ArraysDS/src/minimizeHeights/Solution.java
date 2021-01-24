package minimizeHeights;

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
public class Solution {
	
	public static int getMinDiff(int[] arr, int n, int k) {
        // code here
        int i = 0;
        int min = 2147483647;
        int max = -2147483648;
        for(i = 0; i < arr.length; i++) {
        	
        	if(max < arr[i])
        		max = arr[i];
        	if(min > arr[i])
        		min = arr[i];
        }
        min = min + k;
        if(max >= k) 
        	max = max - k;
        
        if(max > min) 
        	return max - min;
        else 
        	return min - max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array:");
		int n = in.intInput();
		System.out.println("enter array with spaces not newlines:");
		int arr[] = in.stringToArray(n);
		System.out.println("enter k:");
		int k = in.intInput();
		int difference = getMinDiff(arr, n, k);
		System.out.println(difference);
	}

}
