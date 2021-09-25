package com.mv.diffUtil;

import java.util.Scanner;

public class FileComparer
{
	void fileCompare(String firstFilePath, String secondFilePath)
	{
		try
		{
			Scanner firstFile = new FileReader().fileScanner(firstFilePath);
			Scanner secondFile = new FileReader().fileScanner(secondFilePath);
			String firstFileContent = "";
			String secondFileContent = "";
			int counter = 0;
			while (firstFile.hasNextLine() && secondFile.hasNextLine())
			{
				counter++;
				firstFileContent = firstFile.nextLine();
				secondFileContent = secondFile.nextLine();
				if (!firstFileContent.equals(secondFileContent))
					System.out.println("Differences found in line " + String.valueOf(counter) + ":::\nFile1--- "
							+ firstFileContent + "\nFile2--- " + secondFileContent + "\n~~~~~~~~~~~~");
			}

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new FileComparer().fileCompare("C:\\Users\\Vishy\\Desktop\\sampleFile1.txt",
				"C:\\Users\\Vishy\\Desktop\\sampleFile2.txt");
	}

}
