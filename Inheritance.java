import java.util.*;
class Index{
	protected int c;
	public Index() {
		c=0;
	}
	public void show() {
		System.out.println("Value of c ="+c);
	}
	public void incr() {
		c++;
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Myindex i=new Myindex();
        i.show();
        i.incr();
        i.show();
        i.decr();
        i.show();
	}
}
class Myindex extends Index {
	public  void decr() {
		c--;
	}
}
