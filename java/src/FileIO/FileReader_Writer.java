package FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_Writer 
{
	public static void main(String args[]) throws IOException
	{
		File f =new File("/home/lajeem/Desktop/document.Read");
		
		FileWriter fow = new FileWriter(f);
		
		fow.write("Am lajeem shah.T");
		fow.close();
		
		FileReader foR = new FileReader(f);
		
		int a;
		while((a=foR.read())!=-1)
		{
			System.out.print((char)a);
		}	
	}
}
