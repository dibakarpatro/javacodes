import java.util.Scanner;
public class Expt1 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of the center of the Circle");
		float h=sc.nextFloat();
		float k=sc.nextFloat();
		System.out.println("Enter the radius of circle");
		float i=sc.nextFloat();
		System.out.println("Enter the Co-ordinates of a point");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		float d;
		d=(float)Math.sqrt(((k-y)*(k-y))+((h-x)*(h-x)));
			if (d==i) {
				System.out.println("On the perimeter");
			}
			else if(d<i) {
				System.out.println("inside of the circle");
			}
			else {
				System.out.println("outside of the circle");
			}
		}
	
	}


