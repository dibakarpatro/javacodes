import java.util.*;
class Sample{
	public void show()
	{
 	System.out.println("Address is ="+this.hashCode());
	}
	
}
public class Thisreffenceaddress {

	public static void main(String[] args) {
		Sample s1=new Sample();
		System.out.println("Address is= "+s1.hashCode());
		s1.show();
	}

}
//we are finding address of s1
//where s1 is an object