import java.io.*;
public class Metadataaboutafile {
public static void main(String[] args) {
try {
	File f=new File("d:/biodata.txt");
	if(f.exists())
	  {
		f.delete();//found
		System.out.println("File Deleted");
	  }
	else
	  {
		f.createNewFile();//if not found create one file with name
		System.out.println("File created");
	  }
    }
catch(Exception r) {
	System.out.println("File doesnot exist");
}
                                       }
                                }