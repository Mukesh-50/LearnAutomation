package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExelData {

	public static void main(String[] args) {
		
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Mukesh\\ExcelData\\TestData.xlsx");
		
		
		System.out.println(excel.getData(1, 0, 1));

	}

}
