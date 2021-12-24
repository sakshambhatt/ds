package beginner.firstAndLastDigit.aakash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		FastReader fst = new FastReader();
		int T = fst.nextInt();
		while (T-- > 0) {
			int sum = 0;
			int N = fst.nextInt();
			// Converting an integer value into an array of characters(digits as characters)
			char[] digits = String.valueOf(N).toCharArray();

			// Converting the first and last digits into an integer value and adding them.
			sum = Integer.parseInt(String.valueOf(digits[0]))
					+ Integer.parseInt(String.valueOf(digits[digits.length - 1]));

			System.out.println(sum);
		}

	}

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

}