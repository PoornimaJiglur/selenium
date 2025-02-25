package saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//text() function in xpath
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		
		//contains function in xpath
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("book");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		
		//get attribute method
		String res = driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).getAttribute("name");
		System.out.println(res);
		
		//getTagName : to get the tag
		String tagName=driver.findElement(By.xpath("//a[text()=\"Register\"]")).getTagName();
		System.out.println(tagName);
		
		//GetCSSValue
		String cssValue=driver.findElement(By.xpath("//a[text()=\"Register\"]")).getCssValue("color");
		System.out.println(cssValue);
		
		//getSize()
		
		int ht = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getSize().getHeight();
		System.out.println(ht);
		int wt = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getSize().getWidth();
		System.out.println(wt);
		
		//getLocation()
		int locationX = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getLocation().getX();
		System.out.println(locationX);
		int locationY = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getLocation().getY();
		System.out.println(locationY);
		
		//getRect
		
		int rect_ht = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getRect().getHeight();
		System.out.println(rect_ht);
		int rect_wt = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getRect().getWidth();
		System.out.println(rect_wt);
		int rect_x = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getRect().getX();
		System.out.println(rect_x);
		int rect_y = driver.findElement(By.xpath("//a[text()=\"Register\"]")).getRect().getY();
		System.out.println(rect_y);
		
		//isDisplayed(): used for validation whether field is present and then do the actions.
		
		boolean display = driver.findElement(By.xpath("//a[text()=\"Register\"]")).isDisplayed();
		
		if(display)
		{
			System.out.println("Register link is displayed");
			driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		}
		else
		{
			System.out.println("Register link is not displayed");
			
		}
		
		//isEnabled : link or button is enabled or not
		
		boolean enable = driver.findElement(By.xpath("//a[text()=\"Register\"]")).isEnabled();
	
		if(enable)
		{
			System.out.println("register link is enabled");
			driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		}
		else
		{
			System.out.println("register link disabled");
		}
	
		//during validation we have to use isdisplayed. isenabled and then isselected
		
		if(display)
		{
			System.out.println("Register link is displayed");
			driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		
			if(enable)
			{
				System.out.println("register link is enabled");
				driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
			}
			else
			{
				System.out.println("register link disabled");
			}
		}
		else
		{
			System.out.println("Register link is not displayed");
		}
	
	//isSelected: webelement selected or not, for radio button or check box
		
	boolean deselect = driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).isSelected();
	
	if(deselect)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is not selected");
	}
	// clicking on the radio button
	driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
	//checking whether radio button is selected or not
	
	boolean select = driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).isSelected();
	if(select)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is not selected");
	}
	
	//submit
	driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]")).sendKeys("mobile");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	
	
	
	}

}
