package test;
class AA{
	static {
		System.out.println("sb-A");
	}
}
class BB extends AA{
	static {
		System.out.println("sb-B");
	}
}
class CC extends BB{
	static {
		System.out.println("sb-C");
	}
}
public class Test_2 {

	public static void main(String[] args) {
		CC c=new CC();
	}

}
/* 
 * In Java applications, in case of inheritance,when we create object for the sub class then JVM must load the respective sub class bycode to the memory
   in Java,before loading sub class bytecode to the memory JVM will load super class bytecode to the memory.Therefore,the classes loading order in 
   inheritance is from super class to sub class.
 * In case of inheritance,if we provide static context at all the classes which are involved in inheritance then JVM will recognize and execute static
   context at the time of loading the respective classes bytecode to the memory. 
 */