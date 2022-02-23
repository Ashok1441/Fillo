package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UpdateData {
	@Test
	public void update() throws FilloException {
		
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
		
		String UpdateQue = "update Sheet1 set PhoneNo='9997770000',FirstName='Ashok Kumar'  where LastName='Pasula'";// Before FirstName='Ashok'
		
		
		
		con.executeUpdate(UpdateQue);
		con.close();
		
		
	}

}
