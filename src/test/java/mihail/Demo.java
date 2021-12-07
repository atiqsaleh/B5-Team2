package mihail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {

		String url = "https://demoqa.com/text-box/";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mihail\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.id("userName")).sendKeys("Mihail Stegariov");

		driver.findElement(By.id("userEmail")).sendKeys("mihail.aquasafe@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("14801 Hammersmith Circle Silver Spring, MD");

		driver.findElement(By.id("permanentAddress")).sendKeys("1820 Michael Faraday Dr Suite 20, Reston, VA ");

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);
	
	url = "http://demo.guru99.com/test/newtours/";

	driver.get(url);
	
	driver.findElement(By.linkText("REGISTER")).click();

	driver.findElement(By.name("firstName")).sendKeys("Mihail");

	driver.findElement(By.name("lastName")).sendKeys("Stegariov");
	
	driver.findElement(By.name("phone")).sendKeys("240-393-5816");
	
	driver.findElement(By.name("userName")).sendKeys("mihail.aquasafe@gmail.com");
	
	driver.findElement(By.name("address1")).sendKeys("14801 Hammersmith Circle");
	
	driver.findElement(By.name("city")).sendKeys("Silver Spring");
	
	driver.findElement(By.name("state")).sendKeys("Maryland");
	
	driver.findElement(By.name("postalCode")).sendKeys("20906");
	
	driver.findElement(By.name("email")).sendKeys("mihail.aquasafe@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("Sasha09092018");
	
	driver.findElement(By.name("confirmPassword")).sendKeys("Sasha09092018");
	
	driver.findElement(By.name("submit")).click();

	Thread.sleep(5000);

	driver.close();

	}
}
