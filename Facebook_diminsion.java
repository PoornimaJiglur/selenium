package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_diminsion {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email dimension
		int email_rect_ht = driver.findElement(By.xpath("//input[@name=\"email\"]")).getRect().getHeight();
		System.out.println("Email height : " + email_rect_ht );
		int email_rect_wt = driver.findElement(By.xpath("//input[@name=\"email\"]")).getRect().getWidth();
		System.out.println("Email width : " + email_rect_wt );
		int email_rect_X = driver.findElement(By.xpath("//input[@name=\"email\"]")).getRect().getX();
		System.out.println("Email X-axis : " + email_rect_X );
		
		//UN dimension
		int UN_rect_ht = driver.findElement(By.xpath("//div[@id=\"passContainer\"]")).getRect().getHeight();
		System.out.println("UN height : " + UN_rect_ht );
		int UN_rect_wt = driver.findElement(By.xpath("//div[@id=\"passContainer\"]")).getRect().getWidth();
		System.out.println("UN width : " + UN_rect_wt );
		int UN_rect_X = driver.findElement(By.xpath("//div[@id=\"passContainer\"]")).getRect().getX();
		System.out.println("UN X-axis : " + UN_rect_X );
		
		if(email_rect_ht==UN_rect_ht && email_rect_wt==UN_rect_wt && email_rect_X==UN_rect_X)
		{
			System.out.println("EMAIL and UN Dimensions are equal");
		}
		else
		{
			System.out.println("EMAIL and UN Dimensions are not equal");
		}
		
		
	}

}
