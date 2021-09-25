package com.mv.diffUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader 
{
	public Scanner fileScanner(String filePath)
	{
		try 
		{
			return new Scanner(new File(filePath));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public String readFile(String filePath)
	{
		Scanner reader = this.fileScanner(filePath);
		String fileContent = "";
		while(reader.hasNextLine())
			fileContent += reader.nextLine() + "\n";
		return fileContent;
	}
	
}
