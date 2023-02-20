package test;
class AAA{
	static {
		System.out.println("SB-A");
	}
	static int i=m1();
	static int m1() {
		System.out.println("m1-A");
		return 30;
	}
}
class BBB extends AAA{
	static int j=m2();
	static int m2() {
		System.out.println("m2-B");
		return 34;
	}
	static {
		System.out.println("SB-B");
	}
}
class CCC extends BBB{
	static int m3() {
		System.out.println("m3-C");
		return 23;
	}
	static int k=m3();
	static {
		System.out.println("SB-C");
	}
}
public class Test_3 {

	public static void main(String[] args) {
			CCC c=new CCC();
			CCC c1=new CCC();
	}
}
