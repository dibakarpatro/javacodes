import java.io.*;
public class Multithreading3 {
	public static void main(String[] args) {
		Thread e=new Thread(new Example1());
		Thread f=new Thread(new Verify1());
		e.start();
		f.start();
			try {
				for(int i=1;i<=100;i++)
				{
					System.out.println("In main i="+i);
					Thread.sleep(100);
				}}
				catch(Exception r) {
					System.out.println("Failed");
			}

	}
	}
	class Example1 implements Runnable{
		public void run() {
			try
			{
				for(int j=100;j>1;j--)
				{
					System.out.println("In Example j="+j);
					Thread.sleep(100);
				}}
				catch(Exception r) {
					System.out.println("Fialed");
			}
		}
	}
	class Verify1 implements Runnable{
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
