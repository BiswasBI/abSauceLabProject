package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import AbstractComponents.AbstractComponent1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationPage extends AbstractComponent1 {
	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".hero-primary")
	WebElement confirmationMessage;
	
	public String getConfirmationMessage()
	{
		CheckoutPage cp = new CheckoutPage(driver);	
		return confirmationMessage.getText();
	}


}
