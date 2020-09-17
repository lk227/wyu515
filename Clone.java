package day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clone {
	
	public static void copy(String a,String b) throws IOException 
	{
		FileInputStream inputStream=new FileInputStream(a);
		File file=new File(b);
		if(!file.exists())
		{
			file.createNewFile();
			
		}
		FileOutputStream outputStream=new FileOutputStream(file);
		int c;
		byte d[]=new byte[1024];
		while((c=inputStream.read(d))!=-1)
		{
			for(int i=0;i<c;i++)
			{
				outputStream.write(d[i]);
				
				
			}
			inputStream.close();
			outputStream.close();
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		String fString="C:/myfile.txt";
		String dString="C:/myfile_cp.txt";
		copy(fString, dString);
		System.out.println("复制完成");

	}

}
