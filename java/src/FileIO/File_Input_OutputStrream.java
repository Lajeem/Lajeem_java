package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Input_OutputStrream 
	{
		public static void main(String args[])throws IOException
		{
			File fl =new File("/home/lajeem/Desktop/File.frst");
			
			fl.createNewFile();
			
			  System.out.println (fl.getName());
			  System.out.println (fl.getPath()); 
			  System.out.println (fl.canRead());
			  System.out.println (fl.length());
			  
			
			//fl.createNewFile();
			
			
			  String s = "Am lajeem shah";
			  
			  FileOutputStream fos =new FileOutputStream(fl);
			  
			  byte[] b = s.getBytes();
			  
			  fos.write(b);
			 
			  
			  FileInputStream fis = new FileInputStream(fl);
			  
			  int c; while((c=fis.read())!=-1) 
				  
			  { 
			  System.out.print((char)c); 
			  }			
		}
}
