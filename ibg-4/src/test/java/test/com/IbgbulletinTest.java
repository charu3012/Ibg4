



package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author verma
 */
public class IbgbulletinTest {
   private WebDriver driver;
  private String baseUrl;

    public IbgbulletinTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
     @Before
     
    public void setUp(){
     System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        baseUrl = "https://bamboo-gardens.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }   
    
   
   @After
  public void tearDown(){
    }

    @Test
  public void testIbgbulletin() throws Exception {
    driver.manage().window().maximize();
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("[title=\"IBG Bulletin\"]")).click();
    Thread.sleep(2000);
   
    driver.findElement(By.id("Name")).click();
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Arti Verma");
    Thread.sleep(2000);
    
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("ackuselenium@gmail.com");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    new Select(driver.findElement(By.xpath("(//select[@id='Location'])[2]"))).selectByVisibleText("Chicago, IL - Schaumburg");
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("(//select[@id='Location'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='contact_form_fields']/div[4]")).click();

    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).click();
    driver.findElement(By.name("Captcha")).clear();
    driver.findElement(By.name("Captcha")).sendKeys("5738");
    driver.findElement(By.xpath("//input[@value='Send']")).click();
  }   

}