package oops_polymorphism;

public class Method_overloading {
	// same method name but different no.of arguments
	void m1(int a) {
		System.out.println("square : "+(a*a));
	}
	void m1(int a,char b) {
		System.out.println("sum : "+(a+b));
	}
	void m1(char a,int b) {
		System.out.println("sum : "+(a+b));
	}
	void m1(char c) {
		System.out.println("character : "+c);
	}
	void m1(double a,double b) {
		System.out.println("double sum : "+(a+b));
	}
	public static void main(String[] args) {
		Method_overloading ml=new Method_overloading();
		ml.m1('z');
		ml.m1(4);
		ml.m1(2, 6);
		ml.m1(2.3, 8.5);
	}

}
