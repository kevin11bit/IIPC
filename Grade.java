import java.util.*;
public class Grade {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int C = sc.nextInt();
		int P = sc.nextInt();
		
		int add = M+C+P;
		int avg = (M+C+P)/3;
		
		System.out.println("Average Marks is " + avg + ".");
		
		if(avg>90) {
			System.out.println("Grade A");
		}else if(avg<90 && avg>80) {
			System.out.println("Grade B");
		}else if(avg>70 && avg<80) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade D");
		}
	}
}