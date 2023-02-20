package oops_polymorphism;

class Book{
	
}
class Page extends Book{
	
}
class College{
	Book m1() {
		System.out.println("book m1");
		return new Book();
	}
}
class ClassRoom extends College{
	Page m1() {
		System.out.println("book m1");
		return new Page();
	}
}
public class Method_overloading_rule4 {

	public static void main(String[] args) {
		ClassRoom c=new ClassRoom();
		c.m1();
	}

}
