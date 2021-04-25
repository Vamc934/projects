package org.AdactinPages;

import org.Facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBook extends BaseClass {
	public ConfirmBook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_hotel")
	WebElement searchbtn;
	
	@FindBy(id="my_itinerary")
	WebElement itinerary;
	
	@FindBy(id="logout")
	WebElement logout;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
}
