package JavaJan;

public class day1 {

	public static void main(String[] args) {
		System.out.println("shree Ganesh");

		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		int s = 100;
		int v = 50;
		System.out.println(s + v);
		System.out.println(s - v);
		System.out.println(s * v);
		System.out.println(s / v);
		System.out.println(s % v);

		// 10 pair => 50 line of code

		calculator(200, 2);
		int sum = addition(35, 5);
		System.out.println(sum);
	}

	static void calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	};

	public static int addition(int a, int b) {
		return a + b;
	}

}
