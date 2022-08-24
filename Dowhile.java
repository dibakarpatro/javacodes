import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		int d;
		do {
			d=n%10;
			n=n/10;
			rev=rev*10+d;
		}while(n!=0);
	if(rev==temp) {	
     System.out.println("Palindrome number");
	}
	else {
		System.out.println("Not a palindrome number");
	}
		
	}
}
