package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount2 {

	

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Learn");
		//driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Selenium Automation Tester.");
		WebElement ddown =driver.findElement( By.name("industryEnumId"));
		Select options =new Select (ddown);
		options.selectByIndex(3);
		
		WebElement owner =driver.findElement( By.name("ownershipEnumId"));
		Select options1 =new Select (owner);
		options1.selectByVisibleText("S-Corporation");
		
		WebElement source =driver.findElement( By.name("dataSourceId"));
		Select options2 =new Select (source);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement  marketing =driver.findElement( By.name("marketingCampaignId"));
		Select options3 =new Select ( marketing);
		options3.selectByIndex(6);
		
		
		WebElement state =driver.findElement( By.name("generalStateProvinceGeoId"));
		Select options4 =new Select (state);
		options4.selectByValue("TX");
		
		driver.findElement(By.linkText("Create Account")).click();
		
		
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.close();
		

	}

}
