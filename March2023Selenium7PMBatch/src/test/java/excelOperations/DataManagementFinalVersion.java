package excelOperations;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalVersion 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> str) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName = "TestA";
		
		return DataUtil.getTableData(e, sheetName, testName);
  }
}
