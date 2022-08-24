public class Primeperfect {
	public static void main(String[] args) {
		System.out.println("Hello coder");	
		for(int n=1;n<=20;n++) 
			{
			int sum=0;
            for(int i=1;i<=n;i++) 
              {
			    if(n%i==0) {
				sum=sum+i;
			}
              }
		if(sum==2*n) {
			System.out.println(n);
		}
		
		}
		}
	}
