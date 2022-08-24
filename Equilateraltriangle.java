import java.util.Scanner;
public class Equilateraltriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 sides of triangle");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		if (a==b&&b==c) {System.out.println("Equilateral Triangle");
		
		}
		else System.out.println("not a equilqteral");

	}

}
