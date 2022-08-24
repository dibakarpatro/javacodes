import java.util.*;
class Student1{
	private String a;
	private int b;
	public Student1(String x,int y) {
		a=x;
		b=y;
		c=c+1;
	}
	public void show() {
		System.out.println("Student details are =" +"Name ("+a+")Rollno ="+b);
		System.out.println("College name ="+ college +","+" Branch ="+branch);
	}
	private static String college=" NIST";
	private static String branch=" ECE";
	private static int c=0;
	public static void count() {
		System.out.println("no of Students ="+c);
	}
	
}
public class Studentfinding {
	public static void main(String[] args) {
	Student1 s1=new Student1("amit",1);
	Student1 s2=new Student1("asit",2);
	s1.show();
	s2.show();
	Student1.count();

	}

}
