package oops_object_returnTypes;

class Emp{
	
}
class Student{
	
}

public class Object_returnTypes {
	// this way of returning object is not recommended
	Emp m1() {
		System.out.println("m1-method");
		Emp e =new Emp();
		return e;
	}
	// method return type nameless object is recommended
	Student m2() {
		System.out.println("m2-method");
		return new Student();
	}
	public static void main(String[] args) {
		Object_returnTypes t=new Object_returnTypes();
		Emp e=t.m1();
		System.out.println("m1 method return value ..."+e);
		
		Student s=t.m2();
		System.out.println("m2 method return value ..."+s);
	}
}

