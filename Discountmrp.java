import java.util.Scanner;
public class Discountmrp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter MRP");
		float mrp=sc.nextFloat();
		System.out.println("Enter discount in % ");
		float dis=sc.nextFloat();
		float act=mrp-mrp*(dis/100);
		System.out.println("Actual price is"+act);
		
	}

}
