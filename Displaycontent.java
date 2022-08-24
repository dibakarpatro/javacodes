import java.io.*;
public class Displaycontent {
	public static void main(String[] args) {
    try {
   	File f=new File("f:/");
   	String[] k=f.list();
//    	System.out.println("Its contents are...");
//    	for(int i=0;i<k.length;i++)
//    	{
//    		if(k[i].endsWith(".jpg"))
//    		{
//    			System.out.println(k[i]);
//    		}
//    	}
    	for(int i=0;i<k.length;i++)
    	{
    	
    	File f1=new File("f:/",k[i]);
    	if(f1.isDirectory())
    	{
    		System.out.println(k[i]);
    	}
    	//if(f1.isFile())
    	{
    		//System.out.println("k[i]");
    	}
      }
    }
    	catch(Exception r) {
    		System.out.println("File not found");
    	}
    }

	}


