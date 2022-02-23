package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SelectWithLike {
	@Test
	public void like() throws FilloException {
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
		
		String Query="select * from Sheet1 where FirstName like 'First%'";
		String Query1=" Select * from Sheet1 where PhoneNo like '9177%'";
		String Query2="Select * from Sheet1 where LastName like '%Name1'";
		String Query3="Select * from Sheet1 where PhoneNo like '%2034%'";
		
		Recordset rs = con.executeQuery(Query3);
		while(rs.next()) {
			System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("PhoneNo"));
			
		}
		con.close();
		
	}

}
