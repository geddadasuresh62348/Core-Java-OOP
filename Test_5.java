package test;
class A_{
	A_(){
		System.out.println("A-con");
	}
	int i=m1();
	int m1() {
		System.out.println("m1-A");
		return 34;
	}
	{
		System.out.println("IB-A");
	}
}
class B_ extends A_{
	int m2() {
		System.out.println("m2-B");
		return 34;
	}
	{
		System.out.println("IB-B");
	}
	int j=m2();
	B_(){
		System.out.println("B-con");
	}
}
class C_ extends B_{
	{
		System.out.println("IB-C");
	}
	int m3() {
		System.out.println("m3-C");
		return 56;
	}
	C_(){
		System.out.println("C-con");
	}
	int k=m3();
}
public class Test_5 {

	public static void main(String[] args) {
			C_ c1=new C_();
			C_ c2=new C_();
	}

}
