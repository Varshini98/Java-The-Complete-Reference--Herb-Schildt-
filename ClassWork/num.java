import java.util.Scanner;

class num {
	int a;
	int b;
	//String msg;
	public static String msg;

	public num() {
		a = 1;
		b = 1;
		msg = "the sum is";
	}

	public num(int x, int y, String value) {
		a = x;
		b = y;
		msg = value;
	}

	public void add() {
		System.out.println(msg + "=" + (a + b));
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		num.msg="goodbye";

		//num ex1 = new num();// new constructor
		num ex2 = new num(34, 56, "good morning");

		//ex1.add();
		ex2.add();

		// System.out.println("This is a simple Java program.");
		// System.out.println(ex1.a+ ex2.b);

	}
}
