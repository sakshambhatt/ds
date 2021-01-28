package beginner.firstAndLastDigit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int numberOfInputs = 0;
		try {
			numberOfInputs = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 0;
		int j = 0;
		int sum = 0;
		int arr[] = new int[numberOfInputs];
		for(i = 0; i < arr.length; i++) {
			sum = 0;
			try {
				arr[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//adding last digit
			sum = arr[i] % 10;
			
			//adding first digit
			for(j = 1; j <= 6; j++) {
				
				if(arr[i] <= 9) {
					arr[i] = sum;
					break;
				}
				else if(arr[i] / (int)Math.pow(10 * 1.0, j * 1.0) <= 9) {
					
					sum = sum + arr[i] / (int)Math.pow(10 * 1.0, j * 1.0);
					arr[i] = sum;
					break;
				}
			}
		}
		for(i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
