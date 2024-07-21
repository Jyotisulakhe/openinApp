package openinAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class affilinks {
	
	WebDriver driver;
	@BeforeTest
	public void bt() {
		 driver=new ChromeDriver();
		 driver.get("http://openinapp.com/");
		 driver.manage().window().maximize();
	}
	
	@Test(enabled = true)
	public void affilinkHome() {
		driver.findElement(By.xpath("(//p[@class='truncate whitespace-nowrap'])[5]")).click();
		
		

	}
	
	@Test(enabled = true)
	public void video() {
		driver.findElement(By.xpath("(//p[@class='truncate whitespace-nowrap'])[5]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement video = driver.findElement(By.xpath("//p[@class=\"text-2xl text-center flex items-center min-h-full font-livvic\"]"));
		 js.executeScript("arguments[0].scrollIntoView();", video);
		 
		 driver.findElement(By.xpath("//div[@class='flex w-14 h-14 absolute opacity-80']")).click();
		

	}

}
