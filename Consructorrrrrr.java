import java.util.*;
class Sample{
	public void show() {
		System.out.println("Welcome to show");
	}
	public Sample() {
		System.out.println("Welcome to constructor");
	}
}

public class Consructorrrrrr {

	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample();
        s1.show();
        s2.show();
	}
}
