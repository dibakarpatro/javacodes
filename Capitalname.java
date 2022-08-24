import java.util.Scanner;
public class Capitalname {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter state name");
			String a=sc.next();
			switch(a) {
			case "odisha":System.out.println("BBSR");
		    break;
			case"goa":System.out.println("PANAJI");
            break;
			case"punjab":System.out.println("CHANDIGARH");
            break;
			case"mp":System.out.println("BHOPAL");
            break;
			case"telengana":System.out.println("HYD");
            break;
			default:System.out.println("Invalid Output");
			
		}
		
	}

}
