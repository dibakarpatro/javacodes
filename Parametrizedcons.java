import java.util.*;
class Circle2{
	private int x;
	private int y;
	private int z;
	public Circle2(int x2,int y2,int z2)
	{
		x=x2;
		y=y2;
		z=z2;
	}
	public Circle2(int x2,int y2) {
		x=x2;
		y=y2;
		z=1;
	}
	public Circle2(int x2) {
		x=x2;
		y=1;
		z=1;
	}
	public Circle2() {
		x=1;
		y=1;
		z=1;
	}
	
	public void show() {
		System.out.println("Details of circle are "+x+" "+y+" "+z);
	}
}
public class Parametrizedcons {

	public static void main(String[] args) {
		Circle2 c1=new Circle2(3,5,2);
		Circle2 c2=new Circle2(5,3);
		Circle2 c3=new Circle2(5);
	    Circle2 c4=new Circle2();
        c1.show();
        c2.show();
        c3.show();
        c4.show();
	}

}
