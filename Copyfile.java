package day4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		
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
		System.out.println("�ļ����������");

	}

}
