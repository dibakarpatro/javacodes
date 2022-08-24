import java.util.Scanner;
public class Expt {

	public static void main(String[] args) {
		System.out.print("Enter a number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int d;
		int counter=0;
		int sum=0;
		int rev=0;
		int tem=n;
		while(n!=0)
		{counter++;
		d=n%10;
		rev=rev*10+d;
		System.out.println(d);
		 n=n/10;
		 sum=sum+d;
		}System.out.println(counter);
		System.out.println(sum);
		System.out.println(rev);
		if (rev=temp) {
			System.out.println("palindrome");
		}

	}

}
