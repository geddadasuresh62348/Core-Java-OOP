package oops_polymorphism;

class Parent{
	void property() {
		System.out.println("2 acres of land...");
	}
	void marriage() {   //overridden method
		System.out.println("beautiful girl...");
	}
}
class Child extends Parent{
	void marriage() {  //overriding method
		System.out.println("loved girl...");
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.property();
		p.marriage();
		Child c=new Child();
		c.property();
		c.marriage();
	}

}
