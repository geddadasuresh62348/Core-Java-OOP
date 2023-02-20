package oops_aggregation;

public class Hero {
	//instance data
	String name;
	int age;
	double height;
	Address addr;
	Movies mov;
	
	Hero(String name,int age,double height,Address addr,Movies mov){
		this.name=name;
		this.age=age;
		this.height=height;
		this.addr=addr;
		this.mov=mov;
	}
	void display() {
		System.out.println("Hero Name : "+name);
		System.out.println("Hero Age : "+age);
		System.out.println("Hero Height : "+height);
		System.out.println("Hero Address : "+addr.dNo+" "+addr.mandal+" "+addr.street);
		System.out.println("Hero Movies : "+mov.bmov +" "+mov.tmov);
		
	}
	public static void main(String[] args) {
		Address a1=new Address(534,"vinayaka temple","tanuku");
		Movies m1=new Movies("varsham","chatrapathi");
		Hero h1=new Hero("Prabhas",34,6.2,a1,m1);
		h1.display();
	}

}
