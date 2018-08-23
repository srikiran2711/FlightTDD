package Login;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;

  @Test
  public void Login() throws InterruptedException {
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("email")).sendKeys("anirudh@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("anirudh");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Logout")).click();
	  System.out.println("Sucessful");
	 // String breakpoint=driver.findElement(By.tagName("h2")).getText();
	//  Assert.assertEquals(breakpoint, "Prolearn");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "E:\\Gecko\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  Thread.sleep(5000);
	  driver.get("http://localhost:8090/Demo-0.0.1-SNAPSHOT/homepage");
	  Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
  }

}
