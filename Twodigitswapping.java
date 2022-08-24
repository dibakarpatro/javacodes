import java.util.Scanner;
public class Twodigitswapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a two digit number");
		int n=sc.nextInt();
	    int u=n%10;
		int t=n/10;
		int s=u*10+t;
		System.out.println("after swapping our number is"+s);
		


	}

}
