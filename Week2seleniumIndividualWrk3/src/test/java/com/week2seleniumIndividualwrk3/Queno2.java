package com.week2seleniumIndividualwrk3;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Queno2 {

public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
WebDriver driver =  new ChromeDriver();
String mav="https://maveric-systems.com/";
driver.navigate().to(mav);
String url = "";
List<WebElement> links = driver.findElements(By.tagName("a"));
Iterator<WebElement> it = links.iterator();
while(it.hasNext()) {
url = it.next().getAttribute("href");
System.out.println(url);
}

driver.quit();
	}
}


