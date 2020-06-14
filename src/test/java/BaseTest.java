import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
        private String driverPath = "E:/QA/SauceDemo/src/driver/chromedriver";
        public ChromeDriver driver;

        @BeforeClass
        public void setup(){
            System.setProperty("weddriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }
}
