package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	//To get email id and return username
			public String username(int i) throws IOException
			{
				
				FileInputStream file= new FileInputStream("src\\test\\resources\\TestData\\TestData.xlsx");
				XSSFWorkbook workbook =new XSSFWorkbook(file);
				XSSFSheet sheet= workbook.getSheet("Sheet1");
				
					XSSFRow row= sheet.getRow(i);
					XSSFCell cell= row.getCell(0);
					String un= cell.getStringCellValue();
					
					return un;
			}	

		//To get password and return password
			public String password(int i) throws IOException
			{
				
				FileInputStream file= new FileInputStream("src\\test\\resources\\TestData\\TestData.xlsx");
				XSSFWorkbook workbook =new XSSFWorkbook(file);
				XSSFSheet sheet= workbook.getSheet("Sheet1");
					
					XSSFRow row= sheet.getRow(i);
					XSSFCell cell1= row.getCell(1);
					String pwd= cell1.getStringCellValue();
					
					return pwd;
			}
}
