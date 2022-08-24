import java.util.Scanner;
public class Twodimentionarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][3];
		System.out.println("Enter Mtrix");
		for(int i=0;i<a.length;i++) {
		
		   for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
		    }
		   }
		 for(int i=0;i<a.length;i++) {
				
			   for(int j=0;j<a[i].length;j++) {
				   System.out.print(a[i][j]+"\t");
			   }
			   System.out.println( );
		} 

	}

}
