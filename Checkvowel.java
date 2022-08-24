import java.util.Scanner;
public class Checkvowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ALPHABET");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("its a VOWEL");
		}
		else { System.out.println("its a consonant");
		}
		
	}
	

}
