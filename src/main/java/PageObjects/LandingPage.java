package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent1;


public class LandingPage extends AbstractComponent1{
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//WebElement usereEmail = driver.findElement(By.id("userEmail"));
	
	@FindBy(xpath="//*[@id='app']/header/div/div[1]/div[2]/button/span[3]/text()[1]")
	WebElement signUp;
	
	@FindBy(name="email")
	WebElement userEmail;
	
	@FindBy(name="password")
	WebElement userPassword;
	
	@FindBy(xpath="//*[@id=\"modal\"]/div/div/div/div/div/div[2]/div[2]/div[3]/div[5]/button")
	WebElement submit;
	
	@FindBy(className="close-icon-popup")
	WebElement closeButton;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;
	
	
	
	public void loginApplication(String email, String password)
	{
		signUp.click();
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		submit.click();
		closeButton.click();
	}
	
	
	public void goTo()
	{
		driver.get("https://www.cheapoair.com/");	
	}
	

	public String getErrorMessage()
	{
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}

}
