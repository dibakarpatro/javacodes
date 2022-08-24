import java.util.Scanner;
public class Displayprime {

	public static void main(String[] args) {
		System.out.print("Hello coder");	
		for(int n=1;n<=20;n++) 
			{
			int c=0;
            for(int i=1;i<=n;i++) 
              {
			    if(n%i==0) {
				c=c+1;
			}
              }
		if(c==2) {
			System.out.println(n);
		}
		}
	}

	                        }

