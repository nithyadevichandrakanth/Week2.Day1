package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nith");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I want to become an Autoation Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("123@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown=new Select(State);
		dropdown.selectByVisibleText("Florida");
		WebElement Select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(Select);
		dd.selectByIndex(2);
		WebElement firstSelectedOption = dd.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		driver.findElement(By.className("smallSubmit")).click();
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		if(firstName.equals("Haja")) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
System.out.println(driver.getTitle());
	}

}
