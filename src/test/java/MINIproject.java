import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MINIproject {
    WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RanjitPC\\IdeaProjects\\JAGADEV\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    @Test(priority = 1)
    public void verifyLaunchApp() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        String expectedTittle = "Your Store";
        Assert.assertEquals(actualTitle, expectedTittle);
    }

    @Test(priority = 2)
    public void verifyElement() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("My Account")).click();
        boolean element1 = driver.findElement(By.linkText("Register")).isDisplayed();
        Assert.assertEquals(element1, true);

        boolean element2 = driver.findElement(By.linkText("Login")).isDisplayed();
        Assert.assertEquals(element2, true);
    }

    @Test(priority = 3)
    public void CustomerReg() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Titankumar");
        driver.findElement(By.id("input-lastname")).sendKeys("jagadev");
        driver.findElement(By.id("input-email")).sendKeys("titankumarjagadev01@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("7735367571");
        driver.findElement(By.name("password")).sendKeys("Titan@1234");
        driver.findElement(By.name("confirm")).sendKeys("Titan@1234");
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(2000);
        String message = driver.findElement(By.tagName("h1")).getText();
        //System.out.println(message);
        Assert.assertEquals(message, "Your Account Has Been Created!");
    }

    @Test(priority = 4)
    public void userLogin() throws Exception {
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("titankumarjagadev01@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Titan@1234");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        boolean elementExists=driver.findElement(By.linkText("Logout")).isDisplayed();
        Assert.assertEquals(elementExists, true);


    }

}













