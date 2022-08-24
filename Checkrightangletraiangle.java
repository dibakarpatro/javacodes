import java.util.Scanner;
public class Checkrightangletraiangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(c*c==a*a+b*b||a*a==b*b+c*c||b*b==a*a+c*c) {
			System.out.println("right angle triangle");
		}
		else {System.out.println("not a right angle");
	}

 }
}
