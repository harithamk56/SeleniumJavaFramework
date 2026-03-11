package First.Project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookHome {
	@Test
	 public void launchFacebook() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	//get title
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	//If we know the exact Title
	//String expectedTitle="Log into Facebook";
	//Assert.assertEquals(actualTitle, expectedTitle);
	//Partial match better when we don't know exact title
	Assert.assertTrue(actualTitle.contains("Facebook"));
	
	driver.findElement(By.name("email")).sendKeys("haritha.mk");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vanshika143");
	driver.findElement(By.xpath("//div[@aria-label='Log In']")).click();
	
	
}
}