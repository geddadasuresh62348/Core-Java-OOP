package test;
interface I1{
	void m1();
}
interface I2{
	void m2();
}
interface I3{
	void m3();
}
class C implements I1,I2,I3{
	public void m1() {
		System.out.println("m1-C");
	}
	public void m2() {
		System.out.println("m2-C");
	}
	public void m3() {
		System.out.println("m3-C");
	}
}
public class multiple_interfaces_implementation {

	public static void main(String[] args) {
		I1 i1=new C();
		i1.m1();
		System.out.println();
		I2 i2=new C();
		i2.m2();
		System.out.println();
		I3 i3=new C();
		i3.m3();
	}
}
