import java.util.*;
class Mycomplex{
	private int real;
	private int imag;
	public void set(int x,int y)//method
	{
		real=x;
		imag=y;
	}
	public void show() {//method
		System.out.println(real+"+"+imag+"i");
	}
	public Mycomplex add(Mycomplex s) {
		Mycomplex t=new Mycomplex();
		t.real=real+s.real;
		t.imag=imag+s.imag;
		return t;
	}
}
public class imaginaryreal {
	public static void main(String[] args) {
		Mycomplex z1=new Mycomplex();
		Mycomplex z2=new Mycomplex();
		z1.set(3,5);
		z2.set(4,6);
		z1.show();
		z2.show();
		Mycomplex z3=new Mycomplex();
		z3=z1.add(z2);
		z3.show();
	}
}
