import java.util.Scanner;
public class Digitgame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int d;
		int counter =0;
		int sum=0;
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			d=n%10;
			System.out.println(d);
			rev=rev*10+d;
			n=n/10;
			counter++;
			sum=sum+d;
		}
		System.out.println("count number "+counter);
		System.out.println("total sum is "+sum);
		System.out.println("reverse is "+rev);
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else  {
				System.out.println("not a palindrome");}
			
			
		}
	}


