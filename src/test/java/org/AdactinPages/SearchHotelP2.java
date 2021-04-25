package org.AdactinPages;

import org.Facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelP2 extends BaseClass {
	public SearchHotelP2(){
		PageFactory.initElements(driver, this);
		
	}
   @FindBy(id="location")
   WebElement Locat;
   
   @FindBy(id="hotels")
   WebElement hotel;
   
   @FindBy(id="room_type")
   WebElement RT;
   
   @FindBy(id="room_nos")
   WebElement RNum;
   
   @FindBy(id="datepick_in")
   WebElement DIn;
   
   @FindBy(id="datepick_out")
   WebElement DOut;
   
   @FindBy(id="adult_room")
   WebElement AdultR;
   
   @FindBy(id="child_room")
   WebElement ChildR;
   
   @FindBy(id="Submit")
   WebElement sub;
   
   @FindBy(id="Reset")
   WebElement res;

public WebElement getLocat() {
	return Locat;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRT() {
	return RT;
}

public WebElement getRNum() {
	return RNum;
}

public WebElement getDIn() {
	return DIn;
}

public WebElement getDOut() {
	return DOut;
}

public WebElement getAdultR() {
	return AdultR;
}

public WebElement getChildR() {
	return ChildR;
}

public WebElement getSub() {
	return sub;
}

public WebElement getRes() {
	return res;
}
   
  
}
