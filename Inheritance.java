package oops_inheritance;

public class Inheritance {

	public static void main(String[] args) {
		C a=new C();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		a.m6();
	}
}
class A{
	void m1() {
		System.out.println("m1-method");
	}
	void m2() {
		System.out.println("m2-method");
	}
}
class B extends A{
	void m3() {
		System.out.println("m3-method");
	}
	void m4() {
		System.out.println("m4-method");
	}
}
class C extends B{
	void m5() {
		System.out.println("m5-method");
	}
	void m6() {
		System.out.println("m6-method");
	}
}