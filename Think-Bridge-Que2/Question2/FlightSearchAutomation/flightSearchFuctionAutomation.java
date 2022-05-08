import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightSearchFuctionAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//To get Singup page
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		
		driver.findElement(By.xpath("(//span[@class='ng-binding ng-scope'])[2]")).click();
		 driver.findElement(By.xpath("(//div[@ng-bind-html='language'])[1]")).click();
		 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");
		 driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("xyz");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("urmilavjagtap@gmail.com");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.xpath("//label[@class='ui-checkbox']//span[text()='I agree to the']")).click();
	     driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	     WebElement titleValidation = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/section/div[1]/form/div/span"));
	     String actualtext = titleValidation.getText(); 
	     System.out.println(titleValidation.getText());
	     String Expectedtext = "A welcome email has been sent. Please check your email.";
	     if(actualtext.equals(Expectedtext)){
	         System.out.println("title is displayed");
	     }else{
	      System.out.println("title is not displayed");	
	     }
		}

		
		}
		