package oops_inheritance;

class Animal{
}
class Dog extends Animal{
}
class Puppy extends Dog{
}
public class InstanceOf {

	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d=new Dog();
		Puppy p=new Puppy();
		
		// child to parent :true
		System.out.println(a instanceof Object);//true
		System.out.println(d instanceof Object);//true
		System.out.println(p instanceof Object);//true
		System.out.println(d instanceof Animal);//true
		System.out.println(p instanceof Dog);//true
		
		// parent to child : false
		System.out.println(a instanceof Dog);//false
		System.out.println(d instanceof Puppy);//false
		
//		System.out.println(a instanceof String); -->Error
	}
}
