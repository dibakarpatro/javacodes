import java.io.*;
class Emp{
	private String nm;
	private int roll;
	public void show() {
		System.out.println("Details are "+nm+"  "+roll);
	}
	public void get()throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		nm=b.readLine();
		System.out.println("Enter roll no");
		roll=Integer.parseInt(b.readLine());
	}	
}
public class Usingthrowsblock {
    public static void main(String[] args) {
    	try {
    	Emp e=new Emp();
    	e.get();
    	e.show();
    }catch(IOException r)
    	{
    	System.out.println("input invalid...");
    	}
}}
