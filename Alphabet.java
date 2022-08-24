import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':case 'e':case 'i':case 'o':case 'A':case 'E':case 'I':case 'O': case'U':
		case'u':System.out.println("Vowel");
		         break;
		default:System.out.println("Consonant");
		}
	}

}
