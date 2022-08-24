import java.util.Scanner;
public class Checkcolinear {

	public static void main(String[] args) {
		System.out.println("Enter x and y co-ordinate of 3 points");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		if((y2-y1)/(x2-x1)==(y3-y2)/(x3-x2)) {
			System.out.println("It is a co-linear");
		}
		else {
			System.out.println("Not a co-linear");
		}

	}

}
