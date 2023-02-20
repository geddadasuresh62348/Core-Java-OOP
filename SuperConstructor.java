package oops_inheritance;

class Doctor{
	Doctor(){
		System.out.println("Doctor class constructor");
	}
}
class Patient extends Doctor{
	Patient(){
		this(23);
		System.out.println("Patient 0-arg class constructor");
	}
	Patient(int a){
		
		System.out.println("Patient 1-arg class constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		new Patient();
	}

}
