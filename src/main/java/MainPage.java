import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;

    private final By WELCOME_LABEL = By.xpath("//*[@id=\"mp-welcome\"]");

    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public  String GetLabel()
    {
        WebElement label = driver.findElement(WELCOME_LABEL);
        String value = label.getText();

        return value;
    }
}
