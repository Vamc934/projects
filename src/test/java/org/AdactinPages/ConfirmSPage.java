package org.AdactinPages;

import org.Facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSPage extends BaseClass {
	public ConfirmSPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='login']//td[@bgcolor=\"#FFFFFF\"]//input")
	WebElement radio;
	
	@FindBy(id="continue")
	WebElement contin;
	
	@FindBy(id="cancel")
	WebElement cancel;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
