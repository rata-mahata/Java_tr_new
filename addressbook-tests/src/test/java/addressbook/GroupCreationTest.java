package addressbook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupCreationTest {
  FirefoxDriver driver;

  @BeforeMethod
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void GroupCreationTest() {
    driver.get("http://localhost/addressbook/");
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys("test1");
    driver.findElement(By.name("group_header")).sendKeys("test22");
    driver.findElement(By.name("group_footer")).sendKeys("test33");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("groups")).click();
  }

    @AfterMethod
    public void tearDown () {
      driver.quit();
    }
  }



