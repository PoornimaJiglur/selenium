package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Depedent_xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Digital')])")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'3rd Album')])[1]/parent::h2/following-sibling::div[3]/child::div[2]/child::input")).click();
		
	}

}
