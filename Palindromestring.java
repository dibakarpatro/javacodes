import java.lang.*;
import java.util.Scanner;
public class Palindromestring {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String x=sc.next();//create a string
    StringBuffer sb=new StringBuffer(x);//string to stringbuffer conversion
    sb.reverse();//for reverse that stringbuffer
    String y=sb.toString();//stringbuffer to string conversion
   if(x.equalsIgnoreCase(y)) {
	   System.out.println("Palindrome");
   }
   else System.out.println("not a palindrome");
	}

}
