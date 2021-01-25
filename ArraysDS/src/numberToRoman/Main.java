//Take a number between 1 and 1000 inclusive, and give out the roman number for it
package numberToRoman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Input{
	
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
}
public class Main {

	public static String toRoman(int num) {
		//characterArray which holds roman equivalents based on indices
		String romanReference[] = new String[1001];
		//filling reference array with reference values
		romanReference[1] = "I";
		romanReference[4] = "IV";
		romanReference[5] = "V";
		romanReference[9] = "IX";
		romanReference[10] = "X";
		romanReference[50] = "L";
		romanReference[100] = "C";
		romanReference[500] = "D";
		romanReference[1000] = "M";
		
		int key[] = new int[9];
		key[0] = 1;
		key[1] = 4;
		key[2] = 5;
		key[3] = 9;
		key[4] = 10;
		key[5] = 50;
		key[6] = 100;
		key[7] = 500;
		key[8] = 1000;
		
		int i = 0;
		int j = 0;
		int appendCount = -1;
		StringBuilder sb = new StringBuilder();
		//logic to append value wrt key
		for(i = key.length - 1; i > -1; i--) {
			
			if(num % key[i] < num) {
				
				appendCount = num / key[i];
				for(j = 0; j < appendCount; j++) {
					
					sb.append(romanReference[key[i]]);
				}
				num = num % key[i];
			}
		}
//		System.out.println(sb);
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		System.out.println("enter a number between 1 and 1000:");
		int n = in.intInput();
		System.out.println(toRoman(n));
	}

}
