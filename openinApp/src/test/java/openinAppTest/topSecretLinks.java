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
		
		driver.findElement(By.xpath("(//a[@class=\"px-5 py-1 rounded-full\"])[1]")).click();
		driver.navigate().back();

	}

	@Test(enabled = true)
	public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//p[@class='text-base leading-6 font-semibold tracking-wide']")).click();
		driver.findElement(By.xpath("cla(//p[@ss='text-base leading-6 font-semibold tracking-wide'])[2]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/button/span[1]/img")).click();

		
	}
	@AfterTest
	public void complete() {
		driver.quit();
	}
}
