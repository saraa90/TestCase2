package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CustomersPage {
	public CustomersPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}
	@FindBy (xpath ="h3[text()=' Customers']")
	public WebElement customer_page_Customers_TextHeader;
	
	@FindBy (xpath= "//button[text()= ' New Customer']")
	public WebElement customer_page_NewCustomerBTN;
	

}
