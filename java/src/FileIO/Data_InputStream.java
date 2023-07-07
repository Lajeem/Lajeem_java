package FileIO;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Data_InputStream 
{
	public static void main(String args[]) throws IOException 
	{
		File f = new File("/home/lajeem/Desktop/document.text");
		
		f.createNewFile();
		
		 DataInputStream d = new DataInputStream(System.in);
			
		 FileOutputStream fos = new FileOutputStream(f,true);
			  
		 BufferedOutputStream bos = new BufferedOutputStream(fos);
		 
		 System.out.println("pls enter the message");
		 
		 int c ;
		
		 while( (c=d.read())!='%') 
		 {
			//System.out.print((char)c+"");
			
			bos.write(c);
		 }	
			
	}
}

