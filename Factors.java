import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int counter=0;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) 
			{
			System.out.println(i);
			counter++;
			sum=sum+i;
		}  		}
		System.out.println("count= "+counter);
		System.out.println("sum= "+sum);
		if (counter==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		if (sum==2*n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
		}
	}}


