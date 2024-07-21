package openinAppTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class topSecretLinks {

	WebDriver driver;
	@BeforeTest
	public void bt() {
		 driver=new ChromeDriver();
		 driver.get("http://openinapp.com/");
		 driver.manage().window().maximize();
	}
	
	@Test(enabled = false)
	public void topSecretlinkHome() {
		driver.findElement(By.xpath("(//p[@class='truncate whitespace-nowrap'])[7]")).click();
		
		driver.findElement(By.xpath("(//a[@class='px-5 py-1 rounded-full'])[1]")).click();
		driver.navigate().back();

	}

	
	
	@Test(enabled = false)
	
	public void loginbtnCheck() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//p[@class='text-base leading-6 font-semibold tracking-wide']")).click();
		//driver.navigate().back();
		
		
	}
	
	
	
	@Test(enabled = true)
	
	public void siderbarBtn() {
		driver.findElement(By.className("text-text-secondary text-xl")).click();
		
		
	}
	
}
