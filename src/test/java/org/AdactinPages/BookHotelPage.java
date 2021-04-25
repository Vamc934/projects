package org.AdactinPages;

import org.Facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	WebElement fname;
	
	@FindBy(id="last_name")
	WebElement lname;
	
	@FindBy(id="address")
	WebElement add;
	
	@FindBy(id="cc_num")
	WebElement cardnum;
	
	@FindBy(id="cc_type")
	WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	WebElement month;
	
	@FindBy(id="cc_exp_year")
	WebElement year;
	@FindBy(id="cc_cvv")
	WebElement cvv;
	
	@FindBy(id="book_now")
	WebElement book;
	
	@FindBy(id="cancel")
	WebElement cancel;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getCancel() {
		return cancel;
	}


}
