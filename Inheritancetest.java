import java.util.*;
class Sw{
	public void encrypt() {
		System.out.println("Encrypt all files");
	}
	public void download() {
		System.out.println("Download all files slowly");
	}
	public void compress() {
		System.out.println("Compress all text files");
	}
}
class Nsw extends Sw{
	public void download() {
		System.out.println("Download all files fastly");
	}
	public void compress() {
		super.compress();
		System.out.println("Compress also multimedia files");
	}
	public void animate() {
		System.out.println("animate all objects");
	}
}
public class Inheritancetest {
	public static void main(String[] args) {
	Nsw s=new Nsw();
	s.encrypt();
	s.download();
	s.compress();
	s.animate();
	}
}
