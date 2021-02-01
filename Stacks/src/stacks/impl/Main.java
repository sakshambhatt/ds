//Stacks with numbers as elements, demo push and pop
package stacks.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {
	//most important to assign top = -1 when defining the stack
	int top = -1;
	int bottom = 0;
	int[] arr;

	Stack(int size) {
		arr = new int[size];
	}
}

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
	public static void push(Stack st, int elementToPush) {

		if (st.top <= st.arr.length - 1) {
			st.top += 1;
			st.arr[st.top] = elementToPush;
			System.out.println("top = " + st.top + " bottom = " + st.bottom);
		} else {
			System.out.println("stack will overflow, push aborted...");
		}
	}
	
	public static void pop(Stack st) {

		if (st.top >= st.bottom) {
			System.out.println(st.arr[st.top] + " popped");
			st.top -= 1;
			System.out.println("top = " + st.top + " bottom = " + st.bottom);	
		} else {
			System.out.println("stack is empty...");
		}
	}

	public static void display(Stack st) {

		while (st.top >= st.bottom) {
			pop(st);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr = new FastReader();
		System.out.println("enter size of stack:");
		// Ideally size is not defined for a stack
		int size = fr.nextInt();
		System.out.println("creating stack of size " + size + "...");
		Stack st = new Stack(size);
		int choice = -1;
		int element = -1;
		boolean keepRunning = true;
		while(true) {
			if(keepRunning == true) {
				System.out.println("choose operation:\n1 - PUSH\n2 - POP\n3 - DISPLAY");
				choice = fr.nextInt();
				element = 0;
				switch (choice) {
				case 1:
					System.out.println("enter element to push:");
					element = fr.nextInt();
					push(st, element);
					break;
				case 2:
					pop(st);
					break;
				case 3:
					display(st);
					keepRunning = false;
					break;
				}
			} else {
				break;
			}
		}
	}
}
