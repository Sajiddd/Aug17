package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;


public class ValidLogin extends BaseTest {
@Test
public void testValidLogin() {
//	1.	Enter valid user name
	LoginPage loginPage=new LoginPage(driver);
	loginPage.setUserName("admin");
//	2.	Enter valid password
	loginPage.setPassword("manager");
//	3.	Click on login
	loginPage.clickLogin();
//	4.	Verify Home Page is Displayed
//	ETTPage ettPage=new ETTPage(driver);
//	boolean result = ettPage.verifyPageIsDisplayed(wait,"Enter");
//	Assert.assertEquals(result,true);
}
}
