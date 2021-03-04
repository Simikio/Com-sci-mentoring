package Overloading;

class Rectangle {
	
	public static void area(int x, int y) {
		System.out.println(x*y);
		
	}

	public static void area(int x){
		System.out.println(x*x);
	
	}
	
	public static void area(int x, double y) {
		System.out.println(x*y);
		
	}
	public static void area(double x) {
		System.out.println(x*x);
		
	}
	
	public static void main(String[] args) {
		area(4,8);
		area(4,10.1);
		area(20);
		area(4,6);
	}
}
	
