import java.util.*;
class Index2{
	private int i;
	public Index2(int x) {
		i=x;
	}
	public void showi() {
		System.out.println("current i="+i);
	}
}
class Myindex2 extends Index2{
	private int j;
	public Myindex2(int a,int b) {
		super(a);
		j=b;
	}
	public void showj() {
		System.out.println("current j="+j);
	}
	
}
public class Paramitrizedconsininheritance {
	public static void main(String[] args) {
		Myindex2 m=new Myindex2(7,10);
		m.showi();
		m.showj();
		
	}

}
