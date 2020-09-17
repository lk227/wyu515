package day4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		
		String s="C:/myfile.txt";
		String d="C:/myfile_cp2.txt";
		FileReader fReader=new FileReader(s);
		FileWriter dWriter=new FileWriter(d);
		char[] a=new char[1024];
		int b;
		if((b=fReader.read(a))!=-1)
		{
			dWriter.write(a, 0, b);
		}
		fReader.close();
		dWriter.close();
		System.out.println("文件流复制完成");

	}

}
