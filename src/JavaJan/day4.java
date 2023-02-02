package JavaJan;

public class day4 {

	public static void main(String[] args) {
	add1();
	add2();
	
	add3(4,5);
	add3(7,8);
	add3(15,8);
	
	int x1=add4(89,78);
	System.out.println(x1);
	
	System.out.println(add5(90,10));

	}
	
	public static void add1() {
		System.out.println("hello");	
	}
	
	public static void add2() {
		System.out.println(9+9);
	}
	
	public static void add3(int x,int y) {
		System.out.println(x+y);
	}
	
	public static int add4(int a,int b) {
		return a+b;
	}
	
	public static int add5(int w1,int w2) {
		return w1+w2;
	}

}
