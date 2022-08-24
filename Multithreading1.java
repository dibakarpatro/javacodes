import java.io.*;
public class Multithreading1 {
public static void main(String[] args) {
	Verify f=new Verify();
	Example e=new Example();
	//e.run();
	//f.run();
	e.start();
	f.start();
		try {
			for(int i=1;i<=100;i++)
			{
				System.out.println("In main i="+i);
				Thread.sleep(100);
			}}
			catch(Exception r) {
		}

}
}
class Example extends Thread{
	public void run() {
		try
		{
			for(int j=100;j>1;j--)
			{
				System.out.println("In Example j="+j);
				Thread.sleep(100);
			}}
			catch(Exception r) {
		}
	}
}
class Verify extends Thread{
	public void run()
	{
		try
		{
			for(int k=500;k>=1;k=k/2)
			{
				System.out.println("In verify k="+k);
				Thread.sleep(100);		
			}}
		catch(Exception r) {
		}
	}
}