package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;
	
	By registerLinkLocator = By.className("login");
	By usernameLocator = By.id("email");
	By userpassLocator = By.id("passwd");
	By ingresarLinkLocator = By.id("SubmitLogin");
	By dressesLinkLocator = By.className("sf-with-ul");
	By imageLinkLocator = By.xpath("//*[normalize-space(text()) = 'Faded Short Sleeve T-shirts']");

	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser () throws InterruptedException{
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		
		driver.findElement(usernameLocator).sendKeys("dani1@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(userpassLocator).sendKeys("12345");
		Thread.sleep(2000);
		
		driver.findElement(ingresarLinkLocator).click();
		Thread.sleep(2000);
		
		driver.findElement(dressesLinkLocator).click();
		Thread.sleep(2000);
						
		driver.findElement(imageLinkLocator).click();
		Thread.sleep(2000);
	}   

}
