package beginner.firstAndLastDigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		int testCases = 0;
		try {
			testCases = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arr[] = new int[testCases];
		int i = 0;
		int num = 0;
		int j = 0;
		for(i = 0; i < testCases; i++) {
			
			try {
				num = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//adding first digit
			arr[i] = arr[i] + num % 10;
			
			
			//adding last digit
			for(j = 0; j < 6; j++) {
				
				if(num <= 9) {
					
					break;
				}
				else if(num / (int)Math.pow(10.0, (j + 1) * 1.0) <= 9 ) {
					
					arr[i] = arr[i] + num / (int)Math.pow(10.0, (j + 1) * 1.0);
					break;
				}
			}
			
		}
		for(i = 0; i < testCases; i++) {
			
			System.out.println(arr[i]);
		}
		
		
	}

}
