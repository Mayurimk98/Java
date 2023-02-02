package JavaJan;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1();
		
		add2(10,2);
		
		add2(20,6);
		
		add2(100,6);
		
		int a1=add3(50,56);
		System.out.println(a1);
		
		System.out.println(add3(90,4));

	}
	
	//function without parameter without return type
	static void add1() {
		System.out.println(9+9);	
	}
	
	//function with parameter and without return type
	static void add2(int x,int y) {
		System.out.println(x+y);
	}
	
	//function with parement with return type
	static int add3(int a,int b) {
		return a+b;
	}

}
