package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class1 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sony\\Downloads\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window();
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("Manoj.randhawa");
		WebElement Pass=driver.findElement(By.id("pass"));
		Pass.sendKeys("Password");
		//WebElement button=driver.findElement(By.id("u_0_2"));
		//button.click();
		WebElement fname=driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']"));
		fname.sendKeys("Manoj");
		WebElement lname=driver.findElement(By.cssSelector("input[name='lastname']"));
		lname.sendKeys("Randhawa");
		WebElement pnumber=driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']"));
		pnumber.sendKeys("9874563210");
		WebElement pwd=driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
		pwd.sendKeys("741236987");
		WebElement gender=driver.findElement(By.id("u_0_a"));
		gender.click();
		WebElement dd=driver.findElement(By.name("birthday_day"));
		Class1 drop =new  Class1();
		drop.dropdown(dd, 21);
		WebElement mon=driver.findElement(By.cssSelector("select[id='month']"));
		drop.dropdown(mon, 5);
		WebElement yr=driver.findElement(By.id("year"));
		drop.dropdown(yr, 29);
	}
	public void dropdown(WebElement element,int value)
	{
		Select s1= new Select(element);
		s1.selectByIndex(value); 
			}
	
}

