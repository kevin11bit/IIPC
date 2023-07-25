interface Polygon{  // Interface is Used to achieve Total abstraction and Multiple Inheritance.
	
	void getarea(int l, int b); // All methods are public,abstract and without implementation.
	
}

class Triangle implements Polygon{
	public void getarea(int length , int breadth) {
		System.out.println("Area of Triangle = " + (0.5)*length*breadth);
	}
}

class Rectangle implements Polygon{
	public void getarea(int l , int b) {
		System.out.println("Area of Rectangle = " + l*b);
	}
}

class Circle implements Polygon{
	public void getarea(int r,int d) {
		System.out.println("Area of Circle = " + (3.14*r*r));
	}
}
public class Shapes {

	public static void main(String[] args) {
	
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		t1.getarea(10, 20);
		r1.getarea(15, 20);
		c1.getarea(5, 10);
	}

}
