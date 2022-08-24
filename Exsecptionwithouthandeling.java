import java.util.*;

public class Exsecptionwithouthandeling {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("open file");
    	try {
    	    System.out.println("Enter two number");
    	    int a=sc.nextInt();
    	    int b=sc.nextInt();
    	    int c=a/b;
    	    System.out.println("quotient is"+c);
    	}
    	catch(ArithmeticException r)
    	{
    		System.out.println("Division not possible by zero,try again...");
    	}
    	catch(InputMismatchException r)
    	{
    		System.out.println("Invalid inputs,try again...");
    	}
    	catch(Exception r)
    	{
    		System.out.println("Failed due to unknown reason");
    	}
    	finally {
    	System.out.println("close file");
    }
}}
//exception hadelling khali try block catch block auu finally block use kara
//try da jodi b karipariba jodi tikie laguchi
