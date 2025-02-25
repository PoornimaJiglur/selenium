package saturday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClickinFB {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Actions actions=new Actions(driver);
		//right click on email text field
		actions.contextClick(driver.findElement(By.id("email"))).perform();
		//right click without mentioning any fields then it will click starting of the browser
		actions.contextClick().perform();
		
	}

}
