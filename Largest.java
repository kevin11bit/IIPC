import java.util.Scanner;
public class Largest {
	public static void main(String args[]) {
		Scanner var = new Scanner(System.in);
		
		int i=var.nextInt();
		int j=var.nextInt();
		
		int k=(i>j)? i:j;
		System.out.println("Largest number is " + k + ".");
	}
}