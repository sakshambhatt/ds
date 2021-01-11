package javaLoops2;

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
public class Solution {
	
	public static StringBuilder seriesCalulator(String input) {
		
		//0:a, 1:b, 2:n
		int a[] = new int[3];
		
		StringTokenizer st = new StringTokenizer(input);
		StringBuilder bufferOutput = new StringBuilder();
		
		int i = 0;
		int j = 0;
		int preOutput = a[0];
		while(st.hasMoreTokens()) {
			
			a[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		if(a[0] >= 0 && a[0] <= 50 && a[1] >= 0 && a[1] <= 50 && a[2] >=1 && a[2] <= 15) {
			
			//logic to calculate series and put into a spaced out string
			for(i = 0; i < a[2]; i++) {
				
				for(j = 0, preOutput = a[0]; j <= i; j++) {
					
					preOutput = preOutput + ((int)Math.pow(2, j) * a[1]);
				}
				bufferOutput = bufferOutput.append(preOutput + " ");//fastest way to convert int to String
			}
			
		}
		return bufferOutput;
	}
	
	public static void main(String[] args) {
		
		Input in = new Input();
		System.out.println("enter number of queries");
		int q = in.intInput();
		
		if(q >= 0 && q <= 500) {
			
			String inputs[] = new String[q];
			
			for(int i = 0; i < q; i++) {
				
				inputs[i] = in.stringInput();	
			}
			for(int i = 0; i < q; i++) {
				
				System.out.println(seriesCalulator(inputs[i]));
			}
		}
	}
}
