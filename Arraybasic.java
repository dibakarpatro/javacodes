import java.util.Scanner;
public class Arraybasic {

	public static void main(String[] args) {
	int f[]=new int[10];
	 f[0]=0;
	 f[1]=1;
	 int i;
	 for(i=2;i<f.length;i++)
	 {
		 f[i]=f[i-2]+f[i-1];
	 }
	 for(int n:f)
	 {
		 System.out.println(n);
	 }
		 
	 }
	 
	}
