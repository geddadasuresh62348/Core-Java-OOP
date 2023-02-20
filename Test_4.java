// constructors execution in case of inheritance
package test;
class AAAA{
	AAAA(){
		System.out.println("A-con");
	}
}
class BBBB extends AAAA{
	BBBB(){
		System.out.println("B-con");
	}
}
class CCCC extends BBBB{
	CCCC(){
		System.out.println("C-con");
	}
}
public class Test_4 {

	public static void main(String[] args) {
         CCCC c=new CCCC();
	}

}
// In case of inheritance ,when we access sub class constructor as part of creating sub class object JVM will access a 0-arg constructor in superclass
//before executing sub class constructor.If no 0-arg constructor is existed in the super class then compiler will raise an error.
// constructors will be executed starting from super class to sub class