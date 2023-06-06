class Product{
	String name;
	double price;
	int quantity;
	static int 	totalSold;
	
	void sell(int quantity) {
		if(quantity<=this.quantity) {
			this.quantity=-quantity;
			totalSold+=quantity;
		}
	}
	
	static int getTotalSold() {
		return totalSold;
	}
	
}
public class Products {
	public static void main(String args[]) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		p1.name="Pen";
		p2.name="Pencil";
		p3.name="Scale";
		
		p1.price=10;
		p2.price=5;
		p3.price=15;
		
		p1.quantity=50;
		p2.quantity=100;
		p3.quantity=35;
		
		p1.sell(20);
		p2.sell(47);
		p3.sell(11);
		
		System.out.println("Total quantity of products sold = "+Product.getTotalSold());
	}
}
