package addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver driver; //это attribute объекта типа GroupCreationTest

    public static boolean isAlertPresent(FirefoxDriver driver) {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    @BeforeMethod
    public void setUp() throws Exception {
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      driver.get("http://localhost/addressbook/");
      login("admin", "secret"); //тут вызывается метод login, а не ф-я, тк используется тут переменная driver которяая является обхектом )
    }

    private void login(String user, String password) {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(user);
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }

    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHead());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    @AfterMethod
      public void tearDown () {
        driver.quit();
      }

    protected void deleteSelectedGroups() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='test1'])[8]/following::input[2]")).click();
    }

    protected void selectGroups() {
        driver.findElement(By.name("selected[]")).click();
    }
}
