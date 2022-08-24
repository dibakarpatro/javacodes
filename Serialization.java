import java.io.*;
import java.util.Scanner;

class Students implements Serializable{
	private int roll;
	private String nm;
	private Students(int r, String n)
	{
		roll=r;
		nm=n;
	}
	static
	public Students getStudent()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name =");
		String n= sc.nextLine();
		System.out.println("Enter roll no =");
		int r= sc.nextInt();
		Students s=new Students(r,n);
		return s;		
	}
	public void show() {
		System.out.println("Details are = ("+roll+")  "+nm);
	}
}
public class Serialization {
public static void main(String[] args){
	try {
		FileOutputStream fos= new FileOutputStream("d:/Student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Students s= null;
		for(int i=1;i<=3;i++)
		{
			s=Students.getStudent();
			oos.writeObject(s);//serialization
			s.show();
		}
		oos.close();
		fos.close();
		
		System.out.println("Serialization compute");
	}
	catch(Exception r)
	{
		System.out.println("Serialization failed"+r);
	}
}

	

}
