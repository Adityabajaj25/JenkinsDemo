import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    @BeforeClass()
    public void Setup(){
        if (System.getProperty("browser").equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
        }
        //System.setProperty("webdriver.chrome.driver", "D:\\Aditya\\test\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void testcase1(){
        System.out.println("This is test case 1");
    }

    @Test
    public void testcase2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("This is test case 2");
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}
