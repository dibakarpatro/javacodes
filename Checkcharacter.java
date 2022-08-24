import java.util.Scanner;
public class Checkcharacter {

	public static void main(String[] args) {
		System.out.println("ENTER A CHARCTER");
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90) {
			System.out.println("Upper case");
		}
		else if(ch>=90&&ch<=122) {
			System.out.println("Lower case");
		}
		else if(ch>=48&&ch<=57) {
			System.out.println("number");
		}
		else {
			System.out.println("SPECIAL SYMBOL");
		}
	}

	
}
