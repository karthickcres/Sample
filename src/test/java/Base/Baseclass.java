package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	private static final long Duration = 0;
	public static WebDriver driver;
	public static void lunchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			
	}
	public static void lunchurl(String url) {
           
		driver.get(url);
	}
	public static  void maxwindowmain() {

		driver.manage().window().maximize();
	}
	public static void GetTitlemain() {
    String title = driver.getTitle();
    System.out.println("title" + title);
		
	}
	public static  void Geturl() {

		String url = driver.getCurrentUrl();
		System.out.println("url"+url);
		
	}
	public static void Toclse() {

		driver.quit();
	}
	public static void tofillbox(WebElement ele,String value) {
		ele.sendKeys(value);

	}
	public static  void BtnClick(WebElement btn) {

		btn.click();
	}
	public static  void Wait() {
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
