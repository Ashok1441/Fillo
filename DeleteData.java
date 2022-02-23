package dataDriven;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class DeleteData {
	@Test
	public void delete() throws FilloException {
		Fillo fi = new Fillo();
		Connection con = fi.getConnection("D:\\Selenium\\fillo\\Data\\fillo.xlsx");
		
		String DeleteQue="delete from Sheet1 where LastName='Pasula'";
		String deletesheetdata="delete from sheet2";
		
		con.executeUpdate(DeleteQue);
		con.executeUpdate(deletesheetdata);
		con.close();
	}

}
