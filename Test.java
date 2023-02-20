// differences between classes ,abstract classes and interfaces:-
/*1.In case of interfaces,by default,all inner classes are "static" inner classes,not required to declare explicitly,but in case of classes and abstract
 * classes,no default cases are existed for inner classes.
 *2.classes and abstract classes are allowing static blocks and instance blocks.Interfaces are not allowing static blocks and instance blocks
 */
package test;
interface I{
	int x=45;// public static final
	void m1();// public abstract
	void m2();// public abstract
	void m3();// public abstract
}
class A implements I{ // Implementing interface method inside sub class is also like method overriding,so the scope of sub class must same as or weaker
					  // than super class
	public void m1() {
		System.out.println("m1-A");
	}
	public void m2() {
		System.out.println("m2-A");
	}
	public void m3() {
		System.out.println("m3-A");
	}
	public void m4() {
		System.out.println("m4-A");
	}
}
public class Test {

	public static void main(String[] args) {
//		I i=new I();-->Error,we can't create objects for interfaces
		I i= new A();
		i.m1();
		i.m2();
		i.m3();
		i.x;
//		i.m4();-->Error,If we declare reference variable for interface we can only access interface members,but if we declare reference variable for 
				// sub class we can access both interface and sub class members.
		System.out.println();
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}

}
