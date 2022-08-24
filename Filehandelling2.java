import java.io.*;
public class Filehandelling2 {
	public static void main(String[] args) {
   try {
	   FileInputStream fis =new FileInputStream("d:Biodata.txt");
	   System.out.println("The content are");
	   int ch;
	   while((ch=fis.read())!=-1)
	   {
		   System.out.print((char)ch);
	   }
	   fis.close();
       }
   catch(Exception r)
       {
		System.out.println("file doesnot exist");
       }

	}

}
