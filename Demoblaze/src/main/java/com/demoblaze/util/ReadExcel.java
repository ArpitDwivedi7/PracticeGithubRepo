package com.demoblaze.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public String readData(String sheet_name,int row_num,int cell_num)
	{
		String path="E:\\VelocityTraining\\NOTES\\JAVA\\FRAMEWORK\\GitHubRepositoryForPractice\\PracticeGithubRepo\\Demoblaze\\src\\test\\resources\\testdata\\TestData1.xlsx";
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);	
		} 
		catch (IOException e)
		{
			System.out.println("Please check path");
			e.printStackTrace();
		}

		//		String data = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();

		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sheet.getRow(row_num).getCell(cell_num));

		return data;
	}


}










