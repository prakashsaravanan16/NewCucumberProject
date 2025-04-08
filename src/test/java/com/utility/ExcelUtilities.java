package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	public static final String FILE_PATH="C:\\Users\\SAI\\eclipse-workspace\\New Java Project\\NewCucumberProject\\testdata\\TestData.xlsx";
	
	public static Object[][] getTestData(String sheetName) {
		
		List<Object> data = new ArrayList<Object>();
		
		try(FileInputStream fis = new FileInputStream(FILE_PATH);
		
				Workbook workbook = new XSSFWorkbook(fis)){
			
			Sheet sheet = workbook.getSheet(sheetName);
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			
			int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			for (int i = 1; i < rowcount; i++) {  //Skipping header in excel sheet
				
				Row row = sheet.getRow(i);
				
				Object[] rowData = new Object[colcount];
				
				for (int j = 0; j < colcount; j++) {
					
					Cell cell = row.getCell(j);
					
					if (cell==null) {
						
						rowData[j]="";
								
					} else {
						switch (cell.getCellType()) {
						
						case STRING:
							
							rowData[j] = cell.getStringCellValue();
							
							break;
							
						case NUMERIC:
							
							if (DateUtil.isCellDateFormatted(cell)) {
								
								SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
								
								rowData[j] = sdf.format(cell.getDateCellValue());
								
								
							} else {
								
								rowData[j] = String.valueOf((long) cell.getNumericCellValue());
							}
							break;
						case BOOLEAN:
							
							rowData[j] = String.valueOf(cell.getBooleanCellValue());
							
							break;
							default:
								
							rowData[j] ="";
						}

					}
					
				}
				
			   data.add(rowData);
				
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
			
			}
		
		
		return data.toArray(new Object[0][]);
		}

	}
	

