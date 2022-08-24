import java.util.Scanner;
public class Numberstudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter marks");
			a[i]=sc.nextInt();
			
		}
		for(int k:a) {
			System.out.println(k);
		}
	int h=a[0];
    float sum=0;
    float avg;
	for(int i=0;i<a.length;i++) {
		if(a[i]>h) {
			h=a[i];
		}
	}
	
		System.out.println("Highest value"+h);
	for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
	avg=sum/n;
	System.out.println("avg is"+avg);
		
		}
			
	}
