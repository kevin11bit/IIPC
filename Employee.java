
class Employe {
	String name;
	int Year;
	String add;
	int sal;
	Employe(String name,int Year,String add, int sal){
		this.name=name;
		this.Year=Year;
		this.add=add;
		this.sal=sal;
	}
	
	public void show() {
		System.out.println(this.name);
		System.out.println(this.Year);
		System.out.println(this.sal);
		System.out.println(this.add);
	}
}

public class Employee{
	public static void main(String args[]) {
		Employe e1 = new Employe("Robert",1994,"64C- WallsStreat",500000);
		Employe e2 = new Employe("Sam",2000,"68D- WallsStreat",600000);
		Employe e3 = new Employe("John",1999,"26B- WallsStreat",620000);
		e1.show();
		e2.show();
		e3.show();
	}
}