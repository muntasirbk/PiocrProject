import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Piocr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.piocr.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href ='/accounts/login/']")).click();
		driver.findElement(By.id("id_login")).sendKeys("muntasirbk@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Khan12345");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//driver.findElement(By.xpath("//label[@id='upload-img-btn']")).click(); level call dile file upload hobe na
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='id_image']"));
		browse.sendKeys("C:\\Users\\Pavilion\\eclipse-workspace\\PIOCR\\src\\FB_IMG_1591954577049.jpg");
		
		
		
		
		

	}

	

}
