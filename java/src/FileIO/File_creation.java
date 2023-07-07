package FileIO;

import java.io.File;
public class File_creation 
{
public static void main(String args[])
{
	File f = new File("/home/lajeem/Desktop/shah/makl");
	boolean present =f.exists();
	System.out.println("Its shows the folder present or not = "+present);
	
	if(present == false)
		f.mkdirs();
	System.out.println(present =f.exists());
				
}
}
