package Register;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RegisterTest {
	WebDriver driver;
  @Test
  public void Register() throws InterruptedException {
	  driver.findElement(By.linkText("Register")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("title")).sendKeys("Mr");
	  Thread.sleep(3000);
	  driver.findElement(By.name("firstName")).sendKeys("Sai");
	  Thread.sleep(3000);
	  driver.findElement(By.name("middleName")).sendKeys("Karan");
	  Thread.sleep(3000);
	  driver.findElement(By.name("lastName")).sendKeys("Dandumudi");
	  Thread.sleep(3000);
	  driver.findElement(By.name("gender")).sendKeys("F");
	  Thread.sleep(3000);
	  driver.findElement(By.name("emailAddress")).sendKeys("karan@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("karan");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password_confirm")).sendKeys("karan");
	  Thread.sleep(3000);
	  driver.findElement(By.name("mobileNumber")).sendKeys("9100599067");
	  Thread.sleep(3000);
	  driver.findElement(By.name("dateOfBirth")).sendKeys("2018-09-02");
	  Thread.sleep(3000);
	  driver.findElement(By.name("passportNumber")).sendKeys("SHDJ2639");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@type='submit']")).click();
	  String register_successful=driver.findElement(By.tagName("h3")).getText();
	  Assert.assertEquals(register_successful, "Registered successfully");
	  driver.findElement(By.linkText("Logout")).click();
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
