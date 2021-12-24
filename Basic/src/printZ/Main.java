package printZ;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size sides in Z: ");
		int n = sc.nextInt();
		int x = n - 1;
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < n; i++) {
				
				if(j == 0 || j == n - 1) {
					String star = (i == n - 1) ? "*\n" : "*";
					System.out.print(star);
				} else {
					String z = (i == x - 1) ? "*" : (i == n - 1) ? " \n" : " ";
					System.out.print(z);
					if(i == x - 1) {
						x--;
					}
				}
			}
		}
	}

}
