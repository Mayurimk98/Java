package JavaJan;

public class day2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		
		int x=10;
		int y=2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		operations(50,5);
		cal1();
		System.out.println("=======================");
		cal2(4,5);
		cal2(10,2);
		cal2(50,5);
		
		System.out.println("========================");
		
		int a12=cal3(3,4);
		System.out.println(a12);
		
		int a23=cal3(10,3);
		System.out.println(a23);

		
	}
	static void operations(int s,int v) {
		System.out.println(s+v);
		System.out.println(s-v);
		System.out.println(s*v);
		System.out.println(s/v);
		System.out.println(s%v);
	}
	
	//function without parameter without return type
	static void cal1() {
		System.out.println(5+5);
	};
	
	//function with parameter without return type
	static void cal2(int x,int y) {
		System.out.println(x+y);
	};
	
	//function with parameter with return type
	static int cal3(int s1,int s2) {
		return s1+s2;
	};
	


}
