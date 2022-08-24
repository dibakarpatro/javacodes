import java.util.Scanner;
public class Transposematrix {

	public static void main(String[] args) {
	//	int a[][]= {{2,7,3},{8,9,1}};
	//	System.out.println("Given Matrix is");
		//for(int i=0;i<a.length;i++) {
		//	for(int j=0;j<a[i].length;j++) {
			//	System.out.print(a[i][j]+"\t");
		//	}
			//System.out.println(" "); 
		int r;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		r=sc.nextInt();
		System.out.println("Enter no of columns");
		c=sc.nextInt();
		
      	int a[][]=new int[r][c];
		System.out.println("Enter Matrix");
		for(int i=0;i<a.length;i++) {
		
		   for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
		    }
		}
		int t[][]=new int[c][r];
		for(int i=0;i<t.length;i++) {
			for( int j=0;j<t[i].length;j++) {
				t[i][j]=a[j][i];
			}
		}
		System.out.println("Transpose Matrix is");
	    for(int i=0;i<t.length;i++) {
	    	for(int j=0;j<t[i].length;j++) {	    		
	    		 System.out.print(t[i][j]+"\t");
			   }
			   System.out.println( );
	    	}
	    }
		

	}

