import java.util.*;
class Student
{
	private String nm;//data number or instance variable
	private int roll;
	
	public void setData(String x,int y)
	{
		nm=x;
		roll=y;	
	}
	public  void show()
	{
		System.out.println("Details are "+nm +" "+roll);
	}
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		nm=sc.next();
		System.out.println("Enter roll");
		roll=sc.nextInt();
	}
}

public class Studentsusingoops {

	public static void main(String[] args) {

		
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	s1.setData("dibbs", 273);
	s2.setData("tani", 318);
	s1.show();
	s2.show();
	s3.getData();
	s3.show();
	
	}

}
