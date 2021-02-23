package com.week2seleindiwrk;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

public class Queno1 {

	@Before
	public void beforeMethod(){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
	} 
	WebDriver driver;


	@Given("^I navigate to the website$")
	public void givenMethod() throws Throwable{
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		System.out.println("Navigated to registration page");
	}


	@When("^User enters valid data$")
	public void whenMethod(DataTable table) throws Throwable {
		
		//Print the values from country dropdown
		System.out.println("Retrive datas fron country dropdown");
		String Values = driver.findElement(By.xpath("//select[@name='country']")).getText();
		System.out.println(Values);
		
		
		//Send values for registration
		List<List<String>> data=table.raw();			
		driver.findElement(By.name("firstName")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("lastName")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("phone")).sendKeys(data.get(3).get(1));
		driver.findElement(By.id("userName")).sendKeys(data.get(4).get(1));
		driver.findElement(By.name("address1")).sendKeys(data.get(5).get(1));
		driver.findElement(By.name("city")).sendKeys(data.get(6).get(1));
		driver.findElement(By.name("state")).sendKeys(data.get(7).get(1));
		driver.findElement(By.name("postalCode")).sendKeys(data.get(8).get(1));
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText(data.get(9).get(1));
		driver.findElement(By.id("email")).sendKeys(data.get(10).get(1));
		driver.findElement(By.name("password")).sendKeys(data.get(11).get(1));
		driver.findElement(By.name("confirmPassword")).sendKeys(data.get(12).get(1));
		driver.findElement(By.name("submit")).click();
		

		
	}

	@Then("^Registration should be done$")
	public void thenMethod() throws Throwable {
		TakesScreenshot ts =((TakesScreenshot)driver);
		File SrcFile=ts.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./target/W2sele-ss/Registration-Successful.png");
		FileUtils.copyFile(SrcFile, DestFile);	
		}
	@After
	public void afterMethod() throws Throwable {
		driver.quit();
		System.out.println("System quited the browser");  
	}
}
