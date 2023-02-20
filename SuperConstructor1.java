package oops_inheritance;

class Director{
	Director(int a){
		System.out.println("Doctor class constructor");
	}
}
class Hero extends Director{
	Hero(){
		super(45);
		System.out.println("Patient 0-arg class constructor");
	}
	Hero(int a){
		super(46);
		System.out.println("Patient 1-arg class constructor");
	}
}
public class SuperConstructor1 {

	public static void main(String[] args) {
		new Hero();
		new Hero(34);
	}

}
