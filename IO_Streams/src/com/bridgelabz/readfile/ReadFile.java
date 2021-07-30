package com.bridgelabz.readfile;

import java.io.File;
import java.util.Scanner;
//import java.util.Iterator;

public class ReadFile {

	public static void main(String[] args) throws Exception
	{
	
		File read = new File("C:\\Users\\USER\\OneDrive\\Desktop\\simplenote.txt");
		
		Scanner sc = new Scanner(read);
		
		while(sc.hasNext())
		{
		System.out.println(sc.nextLine());
		}
		sc.close();
		}
}
