import java.util.*;
class Sample2{
	static {
		System.out.println("Welcome to block1");
	}
	static {
		System.out.println("Welcome to block2");
	}
	static {
		System.out.println("Welcome to block3");
	}
	
}
public class Staticblock {

	public static void main(String[] args) {
		
		Sample2 s1=new Sample2();
		System.out.println("welcome to main");
		Sample2 s2=new Sample2();
	}

}
