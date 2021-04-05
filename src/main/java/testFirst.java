import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class testFirst {
    WebDriver driver= new ChromeDriver();

    @Test
    public void ParallelTest_1() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./src/parallelTest/chromedriver");
    driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement logo= driver.findElement(By.xpath("//*[@id=\'divLogo\']/img"));
    Assert.assertEquals(logo.isDisplayed(), true);
    Thread.sleep(2000);
 }

    @Test
    public void ParallelTest_2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./src/parallelTest/chromedriver");
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(3000);

    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
