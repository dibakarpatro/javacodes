import java.util.*;
class Shape
{
	public int volume(int a) {	
	int k;
	k=a*a*a;
	return k;
	}
	
	public float volume(float a) {
	float l;
	l=(float)((4/3)*3.14*a*a*a);
	return l;
	}
	
	public float volume(float r,float h) {
		float m;
		m=(float)(3.14*r*r*h);
		return m;
		
	}

}
public class Test {
	public static void main(String[] args) {
		Shape s=new Shape();
		int v=s.volume(5);
		System.out.println("volume of cube is = "+v);
		float sv;
		sv=s.volume(3.5f);
        System.out.println("volume of sphere = "+sv);
        float cv;
        cv=s.volume(3.5f,4.5f);
        System.out.println("volume of cylinder = "+cv);
      
}}
