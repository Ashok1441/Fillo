package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class InsertData {
	@Test
	public void insert() throws FilloException {
		
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
		
		String UpdateQuery="insert into Sheet1(FirstName,LastName,MailId,PhoneNo)values('Ashok kumar','Pasula','ashokLucky577@gmail.com','7779998880')";
		con.executeUpdate(UpdateQuery);
		con.close();
		
	}

}
