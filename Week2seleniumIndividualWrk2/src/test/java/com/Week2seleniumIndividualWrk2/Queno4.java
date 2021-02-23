package com.Week2seleniumIndividualWrk2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Queno4 {
	public static void main(String[] args) {
//	@Test
//	public void method1() {
	File file = new File("./src/main/resources/chromedriver.exe");
	String filePath = file.getAbsolutePath();
	System.out.println(filePath);
	System.setProperty("webdriver.chrome.driver", filePath);
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("start-maximized");
	WebDriver driver =  new ChromeDriver(chromeOptions);
	driver.navigate().to(" http://demo.guru99.com/test/newtours/register.php");
	System.out.println("Successfully executed Chrome browser");
	System.out.println("*****************************************************");
	
	
//	
//	@Test
//	public void method2() {
	
	WebDriver driver1 = null;
    System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette",true);
    driver1= new FirefoxDriver(capabilities);
    FirefoxOptions options = new FirefoxOptions();
    options.setLegacy(true);
    //driver.navigate().to("http://demo.automationtesting.in/Index.html");
    driver1.navigate().to("http://demo.automationtesting.in/Register.html");
    System.out.println("Successfully Executed firefox browser");
	}
	
	
}
