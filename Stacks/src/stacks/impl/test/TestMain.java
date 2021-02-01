//testing if an array can be declared in a class while defined in a constructor with size
package stacks.impl.test;
class Stack {
	int arr[];
	Stack(int size) {
		arr = new int[size];
	}
}
public class TestMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		Stack st = new Stack(x);
		System.out.println(st.arr.length);
	}

}
