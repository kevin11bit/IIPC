
class Bank {
	int bal;
	String name;
	public void setbal(int i) {
		bal=i;
	}
	public int withdrawal(int amount) {
		if((bal-amount)<1000) {
			return bal;
		}else {
			return bal=bal-amount;
		}
	}
	
	public int getbal() {
		return bal;
	}
	
	public void deposit(int amount) {
		bal=bal+amount;
	}
	
	Bank(int bal,String name){
		this.bal=bal;
		this.name=name;
	}
	Bank(){
		this.name="Customer";
		this.bal=0;
	}
}

public class Account{
	public static void main(String args[]) {
		Bank c1 = new Bank();
		Bank c2 = new Bank(250,"kevin");
		System.out.println(c2.getbal());
		System.out.println(c2.name);
		System.out.println(c1.getbal());
		System.out.println(c1.name);
	}
}
