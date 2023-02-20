package test;
interface M1{
	void m1();
}
interface M2{
	void m2();
}
interface M3 extends M1,M2{
	void m3();
}
class N implements M3{
	public void m1() {
		System.out.println("m1-M1");
	}
	public void m2() {
		System.out.println("m2-M2");
	}
	public void m3() {
		System.out.println("m3-M3");
	}
}
public class multiple_interfaces_implementation_1 {

	public static void main(String[] args) {
		M1 i1=new N();
		i1.m1();
		System.out.println();
		M2 i2=new N();
		i2.m2();
		System.out.println();
		M3 i3=new N();
		i3.m1();
		i3.m2();
		i3.m3();
		System.out.println();
		N n=new N();
		n.m1();
		n.m2();
		n.m3();
		
	}

}
