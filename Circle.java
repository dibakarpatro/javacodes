import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius of a Circle");
	float r=sc.nextFloat();
	//float area=3.14f*r*r; 
	float area=(float)(Math.PI*r*r);
	//float perimeter=2*3.14f*r;
	float perimeter =(float)(2*Math.PI*r);
	
	System.out.println("\n area is "+area+"\n perimeter is "+perimeter);
	
	
			

}
}