package sort012;

import java.io.*;
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
	
    //function to sort an array containing only 0, 1, 2
    public static int[] sort012(int a[]) {
        
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int currentIndex = -1;
        int i = 0;
        for(i = 0; i < a.length; i++) {
            
            if(a[i] == 0) {
                counter0++;
            } else if(a[i] == 1) {
                counter1++;
            } else if(a[i] == 2) {
                counter2++;
            }
        }
        //System.out.println(counter0 + " " + counter1 + " " + counter2) ;
        for(i = 0; i < counter0; i++) {
        	a[i] = 0;
        	currentIndex = i;
        }
        
        //System.out.println(currentIndex);
        int buffer = currentIndex;
        for(i = currentIndex + 1; i < buffer + 1 + counter1; i++) {
        	a[i] = 1;
        	currentIndex = i;
        }
        
        buffer = currentIndex;
        
        for(i = currentIndex + 1; i < buffer + 1 + counter2; i++) {
        	a[i] = 2;
        	currentIndex = i;
        }
        
        //System.out.println(currentIndex);
        return a;
    }
    public static void main (String[] args) {
        
        Input in = new Input();
        System.out.println("enter size of aay:");
        int n = in.intInput();
        int a[] = in.stringToarray(n);
        a = sort012(a);
        
        for(int i = 0; i < a.length; i++) {
        	System.out.println(a[i]);
        }
        
    }
}

