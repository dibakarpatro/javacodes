import java.util.*;
class BankAccount{
	private String name;
	private int accno;
	private double bal;

	public BankAccount(String x,int y,double z) {
		name=x;
		accno=y;
		bal=z;
	}
	public void show() {
		System.out.println("Details are("+name+","+accno+","+bal+")");
	}
	public void WithDraw(double w)throws BankException {
		if((bal-w)<500) {
		BankException be=new BankException(name);
		throw be;
		}
		bal=bal-w;
		System.out.println("You have withdraws "+w+"rupees successfully");
	}	
}
class BankException extends Exception{
	private String nm;
	public BankException(String x) {
		nm=x;
	}
	public void report() {
		System.out.println("Hi "+nm+" you have insufficient balance");
	}
}
public class Throwruntimepollymorphism {
	public static void main(String[] args) {
	BankAccount b= new BankAccount("Amit",101010,200000.0);
	b.show();
	Scanner sc=new Scanner(System.in); 
		double w=0.0;
	try {
	    while(true) {
		System.out.println("Enter amount to withdraw");
		w=sc.nextDouble();
		b.WithDraw(w);
	}
    } 
	catch(BankException r)
	{
	 r.report();
	}
	}
	}
	
