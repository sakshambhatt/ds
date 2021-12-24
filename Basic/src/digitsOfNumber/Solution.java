package digitsOfNumber;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		// System.out.println("num: " + num);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(i = num; i >= 10; i = i / 10) {
			list.add(i % 10);
		}
		list.add(i);
		
		// print array list items in reverse
		System.out.println(list);
		sc.close();
	}

}
