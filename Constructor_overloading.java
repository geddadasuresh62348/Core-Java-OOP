package oops_polymorphism;

public class Constructor_overloading {
	Constructor_overloading(){
	System.out.println("0-arg constructor");	
	}
	Constructor_overloading(int a){
		System.out.println("1-arg constructor"+a);	
		}
	Constructor_overloading(int a,int b){
		System.out.println("2-arg constructor"+a+" "+b);	
		}
	public static void main(String[] args) {
		new Constructor_overloading();
		new Constructor_overloading(10);
		new Constructor_overloading(10,20);

	}
}
