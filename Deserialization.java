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
public class Deserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("d:/Student.txt");
			ObjectInputStream dis=new ObjectInputStream(fis);
			Students s=null;
			while((s=(Students)dis.readObject())!=null)
			{
				s.show();
			}
			dis.close();
			fis.close();	
		}
		catch(Exception r) {
			
		}
	}

}
