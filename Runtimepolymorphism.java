import java.util.*;
abstract class Shape1{
	public void fillColour() {
		System.out.println("Fill with colour");
	}
    public abstract void draw(); //Abstract

}
class Circlee extends Shape1{
	public void draw() {
		System.out.println("Draw a circle");
	}
}

class Rectangle extends Shape1{
	public void draw() {
		System.out.println("Draw a Rectangle");
	}
}

public class Runtimepolymorphism {
	public static void main(String[] args) {
	
	Shape1 s;
	
	s=new Circlee();
	s.draw();
	s.fillColour();
	
	s=new Rectangle();
	s.draw();
	s.fillColour();
	
	}}

