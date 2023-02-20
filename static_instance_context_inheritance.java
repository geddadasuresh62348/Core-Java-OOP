package test;
class A__{
	A__(){
		System.out.println("A-con");
	}
	{
		System.out.println("IB-A");
	}
	int m1() {
		System.out.println("m1-A");
		return 0;
	}
	int i=m1();
	static {
		System.out.println("SB-A");
	}
	static int m2() {
		System.out.println("m2-A");
		return 78;
	}
	static int j=m2();
}
class B__ extends A__ {
	{
		System.out.println("IB-B");
	}
	int i=m3();
	int m3() {
		System.out.println("m3-B"); 
		return 0;
	}
	static {
		System.out.println("SB-B");
	}
	B__(){
		System.out.println("B-con");
	}
	static int j=m4();
	static int m4() {
		System.out.println("m4-B");
		return 0;
	}
}
class C__ extends B__{
	C__(){
		System.out.println("C-con");
	}
	static {
		System.out.println("SB-C");
	}
	{
		System.out.println("IB-C");
	}
	static int m5() {
		System.out.println("m5-C");
		return 0;			
	}
	int m6() {
		System.out.println("m6-C");
		return 0;
	}
	static int m=m5();
	int n=m6();
}
public class static_instance_context_inheritance {

	public static void main(String[] args) {
//		C__ c=new C__();
//		C__ c1=new C__();
		new C__();
		new C__();
	}
}
