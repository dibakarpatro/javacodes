import java.util.*;
class Parent{
	public void Property() {
		System.out.println("Land+Gold");
	}
    public void marry() {
	    System.out.println("Marry with X");
    }
   }
class Child extends Parent{
	public void marry() {
		System.out.println("Marry with Y");
	}
}
public class Parentpropertyusingoverridig {

	public static void main(String[] args) {
	Parent p=new Parent();
		p.Property();
		p.marry();

    Child c=new Child();
        c.Property();
        c.marry();
        
    Parent n=new Child();
         n.Property();
         n.marry();
  
    //Child a=new Parent();//( not possible )
      //   a.Property();
       //  a.marry();
	}}
    

