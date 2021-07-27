import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Util {

    public  WebDriver GetDriver()
    {
            WebDriver driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

            return driver;
    }


}
