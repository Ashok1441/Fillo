package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SelectWithWhere {
	@Test
	public void where() throws FilloException {
		
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
//		
//		String Query = "select * from Sheet1 where LastName='LastName5'";
//		String Query1 = "select * from Sheet1 where FirstName='FirstName1'";
//		Recordset rs = con.executeQuery(Query);
		
		Recordset rs = con.executeQuery("select * from Sheet1").where("LastName='LastName5'");
		
		while(rs.next()) {
			System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("Phone NO"));
		}
		
//		rs=con.executeQuery(Query1);
		rs=con.executeQuery("select * from Sheet1").where("FirstName='FirstName1'").where("MailId='9@gmail.com'");
		while(rs.next()){
			System.out.println(rs.getField("FirstName")+"    "+rs.getField("LastName")+"   "+rs.getField("MailId")+"      "+rs.getField("Phone NO"));
			
		}
	
		con.close();
	}

}
