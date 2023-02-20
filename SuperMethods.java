package oops_inheritance;

class Teacher{
	void m1() {
		System.out.println("teacher m1() method..");
	}
}
class student extends Teacher{
	void m1() {
		System.out.println("student m1() method..");
	}
	void m2() {
		this.m1();
		super.m1();
	}
}
public class SuperMethods {

	public static void main(String[] args) {
		new student().m2();
	}

}
