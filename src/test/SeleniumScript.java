package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions().setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.get("https://datacom.com/nz/en/contact-us");
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//SignIN
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div[1]/a/span"));
        button.click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Sign in to Datacom | Get access to Datacom's payroll applications and specific marketplace platforms for your region.");
        //This method verifyTitle if boolean and if the method is meet then it wall pass if not it will error
		 assertFalse(verifyTitle);
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // click on button with the id "Sign In Data Pay"
        WebElement button2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/div/div/ul/li[1]/div[2]/a"));
        button2.click();
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // get sing in title
         WebElement user=driver.findElement(By.name("username"));
         WebElement pass=driver.findElement(By.name("password")); 
         try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
         user.sendKeys("examjava@gmail.com");
		 pass.sendKeys("123565");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  WebElement button3 = driver.findElement(By.xpath("/html/body/div/div[3]/main/form/button"));
		  button3.click();
		  
		  // Verify if the user name and password is correct or not
         String actualUrl="https://datacomdirectaccess.co.nz/login/username"; 
         String expectedUrl= driver.getCurrentUrl(); 
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
         System.out.println("Test passed"); 
		  } 
		  else { 
		  System.out.println("Test failed"); 
		  }       
	}

	public static void assertFalse(Boolean verifyTitle) {
		// TODO Auto-generated method stub
		
	}

}
