import java.io.*;
public class Filehandeling {
	public static void main(String[] args) {
      try {
    	  DataInputStream dis=new DataInputStream(System.in);
    	  FileOutputStream fos=new FileOutputStream("d:/Biodata.txt");
    	  char ch;
    	  System.out.println("Enter details");
    	  while((ch=(char)dis.read())!='@')
    	  {
    		  fos.write(ch);
    	  }
    	  fos.close();
    	  dis.close();
    	  System.out.println("file saved");
      }
      catch(Exception r)
      {
    	  System.out.println("file updation failed");
      }
	}

}
