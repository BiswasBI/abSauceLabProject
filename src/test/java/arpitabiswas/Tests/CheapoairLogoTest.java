package arpitabiswas.Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.LandingPage;
import PageObjects.OrderPage;
import PageObjects.ProductCatalogue;
import arpitabiswas.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import arpitabiswas.TestComponents.BaseTest;

public class CheapoairLogoTest extends BaseTest{

	@Test(dataProvider="getData",groups= {"LogoTest"})

	public void CheapoairLogoTesting(HashMap<String,String> input) throws InterruptedException, IOException {
		System.out.print("CheapoairLogoTest");
		
		landingPage.loginApplication(input.get("email"), input.get("password"));		
	
	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{

		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//arpitabiswas//data//PurchaseOrder.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	}
	
	
}
