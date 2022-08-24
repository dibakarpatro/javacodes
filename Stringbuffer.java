import java.lang.*;
public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append("world");
		System.out.println(sb);
		sb.append("25");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(0, '@');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(2, "@#!");
		System.out.println(sb);
		
		

	}

}
