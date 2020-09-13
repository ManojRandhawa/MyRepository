package pkg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		List<WebElement> all=driver.findElements(By.className("_2hvTZ pexuQ zyHYP"));
		System.out.println("Total Elements" + all.size());
		for(WebElement e:all)
		{
			e.sendKeys("Hunny");
			
		}
		
		
		
	}

}
