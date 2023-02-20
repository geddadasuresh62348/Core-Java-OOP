package oops_inheritance;

class Father{
	int a=10,b=20;
}
class Son extends Father{
	int a=100,b=200;
	void add(int a,int b) {
		System.out.println("super class variables : "+(super.a+super.b));
		System.out.println("current class variables : "+(this.a+this.b));
		System.out.println("local variables : "+(a+b));
	}
}
public class Super {

	public static void main(String[] args) {
		Son s=new Son();
		s.add(1000, 2000);
	}

}
