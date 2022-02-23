package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadData {
	
	@Test
	public void excel() throws FilloException {
		
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
		
		String selQuery="select * from Sheet1";
		Recordset rs = con.executeQuery(selQuery);
		while(rs.next()) {
			System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
		}
		System.out.println("-------------------------------------------------------------------");
		//Total Rows in Excell Sheet
		System.out.println("Total Rows in excel  "+rs.getCount());
		
		//total col size in excel sheet
		System.out.println("-------------------------------------------------------------------");
		int col = rs.getFieldNames().size();
		System.out.println("total Coulmn size "+col);
		
		//getting coulmn name
		System.out.println("-------------------------------------------------------------------");
		String fn = rs.getFieldNames().get(0);
		String sn = rs.getFieldNames().get(1);
		String tn = rs.getFieldNames().get(2);
		String frn = rs.getFieldNames().get(3);
		System.out.println("First coulmn Name :"+fn+"\n"+"Second coulmn Name :"+sn+"\n"+"Third coulmn Name :"+tn+"\n"+"Fourth coulmn Name :"+frn);
		
		System.out.println("-------------------------------------------------------------------");
		rs.movePrevious();
		System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
		
		System.out.println("-------------------------------------------------------------------");
		rs.moveFirst();
		System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
		
		System.out.println("-------------------------------------------------------------------");
		rs.moveNext();
		System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
		
		System.out.println("-------------------------------------------------------------------");
		rs.moveLast();
		System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
		
		con.close();
		
		
	}

}
