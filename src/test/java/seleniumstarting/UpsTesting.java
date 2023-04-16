package seleniumstarting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsTesting {

	public static void main(String[] args) throws InterruptedException {
		// How to open a browser
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.ups.com/lasso/login");
		Driver.manage().window().maximize();
		// Driver.manage().window();
		// Thread.sleep(10000);
		Driver.findElement(By.xpath("//*[@name='userID']")).sendKeys("qabatch34");
		Driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Batch34nyc");
		Driver.findElement(By.xpath("//button[@type='submit'] ")).click();
		Driver.manage().deleteAllCookies();
		// Driver.close();
		// Driver.manage().window();
	}
}
