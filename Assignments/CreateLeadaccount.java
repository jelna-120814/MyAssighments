package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadaccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fiona");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Iriston");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test-leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Lead");
		driver.findElement(By.linkText("Create Lead")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
