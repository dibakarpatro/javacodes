import java.util.*;
class Index1{
	protected int x=35;
}
class Myindex1 extends Index1{
	protected int x=40;

public void show() {
	System.out.println(x);
	System.out.println(super.x);
}
}
public class Superkeyword {
	public static void main(String[] args) {
	Myindex1 m=new Myindex1();
	m.show();
	}
}


