package org.Facebook;

import org.AdactinPages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login2 {
	BaseClass bc;
	LoginPage lp;
	@BeforeClass
	private void browserLaunch() {
		bc=new BaseClass();
		bc.launchBrowser("firefox");
		bc.luanchUrl("https://adactinhotelapp.com/index.php");



	}
	@Test
	private void login() {
		lp=new LoginPage();
		bc.enterText(lp.getUserName(), "karthi007");
		bc.enterText(lp.getPass(), "Karthi@1989");
		bc.click(lp.getLbn());
	}

}
