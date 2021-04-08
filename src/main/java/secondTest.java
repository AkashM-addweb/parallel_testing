import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class secondTest {

    WebDriver driver= new ChromeDriver();

    @Test
    public void ParallelTest_3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./src/parallelTest/chromedriver");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebElement logo= driver.findElement(By.xpath("//*[@id=\'divLogo\']/img"));

        driver.findElement(By.name("txtUsername")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

        WebElement login= driver.findElement(By.className("panelTrigger"));
        Assert.assertEquals(login.isDisplayed(), true);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();

    }






}
