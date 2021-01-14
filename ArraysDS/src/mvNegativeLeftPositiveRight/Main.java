package mvNegativeLeftPositiveRight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Input {
    
    //function to take integer input
    public int intInput() {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int output = 0;
        try {
            output = Integer.parseInt(br.readLine());
        } catch(Exception e) {
            System.out.println("Exception occured!");
        }
        return output;
    }
    
    //function to take String input and convert into integer array
    public int[] stringToarray(int size) {
        
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String aay = null;
        try {
            aay = br.readLine();
        } catch(Exception e) {
            System.out.println("Exception occured!");
        }
        StringTokenizer st = new StringTokenizer(aay);
        int a[] = new int[size];
        int i = 0;
        while(st.hasMoreTokens()) {
			
			a[i] = Integer.parseInt(st.nextToken());
			i++;
		}
        return a;
    }
}
public class Main {
	
	//function to move negative numbers to left and positive ones to the right
	public static int[] negToLeftPosToRight(int arr[]) {
		
		int oArray[] = new int[arr.length];
		int i = 0;
		int j = 0;
		
		//filling negative elements 
		for(i = 0, j= 0; i < arr.length; i++) {
			
			if(arr[i] < 0) {
					
				oArray[j] = arr[i];
				j++;
			}
		}
		
		//filling positive elements 
		for(i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0) {
				
				oArray[j] = arr[i];
				j++;
			}
		}
		
		return oArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter size of array:");
		int n = in.intInput();
		
		int arr[] = in.stringToarray(n);
		arr = negToLeftPosToRight(arr);

		for(n = 0; n < arr.length; n++) {
			
			System.out.println(arr[n]);
		}
	}

}
