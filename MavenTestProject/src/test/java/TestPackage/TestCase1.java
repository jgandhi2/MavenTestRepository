package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestBasePackage.TestBasePage;

public class TestCase1 extends TestBasePage {


	@Test
	public void TC_001_validateCantLoginLink()
	{
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.findElement(By.cssSelector("#cantLogin")).click();
		String dialogText = driver.findElement(By.xpath("//p[@class='dialog-instructions']")).getText();
		System.out.println(dialogText);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		driver.quit();
	}

}