import java.io.*;
public class Multitreading {
	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Name"+t.getName());
		System.out.println("Priority"+t.getPriority());
		System.out.println("Group Name"+t.getThreadGroup());
		

	}

}
