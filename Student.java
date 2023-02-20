package oops_aggregation_task;

public class Student {

	int sId;
	String sName;
	String schoolName;
	Parents parents;
	Marks marks;
	Student(int sId,String sName,String schoolName,Parents parents,Marks marks){
		this.sId=sId;
		this.sName=sName;
		this.schoolName=schoolName;
		this.parents=parents;
		this.marks=marks;
	}
	void disp(){
		System.out.println("------student details-------");
		System.out.println("Student Name        : "+this.sName);
		System.out.println("Student Id          : "+this.sId);
		System.out.println("Student school Name : "+this.schoolName);
		System.out.println("Student father Name : "+parents.fName);
		System.out.println("Student mother Name : "+parents.mName);
		System.out.println("Student Marks       : "+marks.m1+" "+marks.m2+" "+marks.m3);
	}
	void status() {
		if(marks.m1+marks.m2+marks.m3>105)
			 System.out.println("you are passed ");
		else System.out.println("you are failed");
		}
	public static void main(String[] args) {
		Student std=new Student(123,"narayana","zph",new Parents("suranna","subbamma"),new Marks(32,54,32));
		std.disp();
		std.status();
	}

}

