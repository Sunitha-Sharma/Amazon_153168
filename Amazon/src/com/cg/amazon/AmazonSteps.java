package com.cg.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSteps {
	WebDriver driver;
	@Given("^To add Five products in cart$")
	public void to_add_Five_products_in_cart() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\sunitsha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/"); 
	}

	@Given("^select the products you need to buy$")
	public void select_the_products_you_need_to_buy() throws Throwable {
		
		WebElement prod1=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		prod1.sendKeys("Iphone x");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();
		//driver.navigate().to("");
		driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[1]/div/div/a/img")).click();
		driver.getWindowHandle();
		for(String with:driver.getWindowHandles())
		{
			driver.switchTo().window(with);
		}
		WebElement cart1=driver.findElement(By.id("add-to-cart-button"));
		cart1.click();
		
		driver.navigate().to("https://www.amazon.com/");
		
		WebElement prod2=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		prod2.sendKeys("watch");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();
		//driver.navigate().to("");
		driver.findElement(By.xpath("//*[@id=\"result_25\"]/div/div[2]/div/a/img")).click();
		driver.getWindowHandle();
		for(String with:driver.getWindowHandles())
		{
			driver.switchTo().window(with);
		}
		WebElement cart2=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart2.click();
		

		driver.navigate().to("https://www.amazon.com/");
		
		WebElement prod3=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		prod3.sendKeys("Moto e4 plus");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).submit();
		//driver.navigate().to("");
		//driver.findElement(By.xpath("//*[@id=\"pdagDesktopSparkle\"]/div/div[1]/div[1]/a/div/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div/div/div[1]/div/div/a/img")).click();
		driver.getWindowHandle();
		for(String with:driver.getWindowHandles())
		{
			driver.switchTo().window(with);
		}
		WebElement cart3=driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		cart3.click();
	}

	@Then("^Buy them$")
	public void buy_them() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	}



}
