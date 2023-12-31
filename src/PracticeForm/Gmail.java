package PracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail {
	
public WebDriver driver;

	public void OpenURL() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "G:\\Gmail Janaki Ram\\geckodriver.exe\\");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]/span[2]")).click();
		}
	public void Createaccount() throws Exception {
		//FirstName
		driver.findElement(By.id("firstName")).sendKeys("VenkataRajesh");
		//LastName
		driver.findElement(By.id("lastName")).sendKeys("Chappa");
		//Next Button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		Thread.sleep(3000);
		//Month
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("July");
		//Day
		driver.findElement(By.id("day")).sendKeys("24");
		//Year
		driver.findElement(By.id("year")).sendKeys("1994");
		//Gender
		new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Male");
	
		//Next Button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div[2]/div[2]/div/div[2]/div/div/div/div/button/span")).click();
		
	
	
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Gmail G = new Gmail();
		G.OpenURL();
		G.Createaccount();
	}

}
