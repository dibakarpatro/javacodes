import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter year to check leap year or not");
		Scanner sc=new Scanner(System.in);
		int y =sc.nextInt();
		if(y%100==0) {
			if (y%400==0) {
				System.out.println("LEAP year");	
			}
			else {
			System.out.println("Not a LEAP year");
		}
		}
		else {
			if (y%4==0) {
				System.out.println("LEAP year");
			}
			else { System.out.println("Not a LEAP year");
		}
			
		}
	}
}