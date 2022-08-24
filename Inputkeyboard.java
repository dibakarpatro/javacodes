import java.util.Scanner;

public class Inputkeyboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
	    System.out.print("Enter your name");
		String nm=sc.nextLine();
		
		System.out.print("Enter your age");
		int age=sc.nextInt();
		
		System.out.print("Enter your salary");
		float sal=sc.nextFloat();
		
		System.out.print("Marital status");
		char ms=sc.next().charAt(0);
		
		System.out.println("My name is\n"+nm+"\nmy age is"+age+"my income is\n"+sal+"marital status\n"+ms);
    
		
		
		

	}

}
