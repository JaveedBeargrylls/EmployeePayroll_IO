package com.bridgelabz.readfile;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.util.Iterator;

public class File {
	
		public static void main(String[] args) throws Exception
		{
		try {
			FileReader inputFileReader = new FileReader("C:\\Users\\USER\\OneDrive\\Desktop\\simplenote.txt");
			//PrintWriter pw = null;
			//Scanner sc = new Scanner(read);
			
			FileWriter outputFileWriter = new FileWriter("C:\\Users\\USER\\OneDrive\\Desktop\\Demo.txt");
			int data;
			
			while((data = inputFileReader.read()) !=-1)
			{
				System.out.print((char)data);
				//pw.println(data);
				outputFileWriter.write(data);
				outputFileWriter.flush();
			}
			//outputFileWriter.close();
			inputFileReader.close();
			outputFileWriter.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("file read Operation");
		}
	}
}

