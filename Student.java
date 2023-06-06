import java.util.*;

class Student1{
	String name;
	int id;
	int age;
	int No;
	
	Scanner sc = new Scanner(System.in);
	public void getdata() {
		System.out.print("Enter name :");
		name=sc.nextLine();
		
		System.out.print("Enter id :");
		id=sc.nextInt();
		
		System.out.print("Enter age :");
		age=sc.nextInt();
		
		System.out.print("Enter Mobile Number :");
		No = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Name of the Student = " + this.name);
		System.out.println("ID of the Student = " + this.id);
		System.out.println("Age of the Student = " + this.age);
		System.out.println("Mobile number of the Student = " + this.No);
	}
}
public class Student{
	public static void main(String args[]) {
		Student1 s= new Student1();
		s.getdata();
		s.display();
	}
}