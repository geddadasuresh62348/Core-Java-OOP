package test;
interface K{
	void m1();
	void m2();
	void m3();
}
abstract class L implements K{
	public void m1() {
		System.out.println("m1-K");
	}
}
class M extends L{
	public void m2() {
		System.out.println("m2-M");
	}
	public void m3() {
		System.out.println("m3-M");
	}
}
public class Test_1 {

	public static void main(String[] args) {
		L l=new M();
		l.m1();
		l.m2();
		l.m3();
		
		K k=new M();
		k.m1();
		k.m2();
		k.m3();
	}

}
