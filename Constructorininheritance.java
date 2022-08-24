import java.util.*;
class Base
 {
	public Base() {
	System.out.println("0-argument constructor of base");
   }
 }
class Der extends Base{
	public Der() {
		//super();--->this is optionalin zero argument constructor
		System.out.println("0-argument constructor of der ");
	}
}
public class Constructorininheritance {

	public static void main(String[] args) {
		Der d=new Der();
	}

}
