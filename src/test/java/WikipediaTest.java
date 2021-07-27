import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class WikipediaTest {

    public WebDriver driver;

    @BeforeEach
    public void Init()
    {
        Util util = new Util();
        driver = util.GetDriver();
    }

    @Test
    public void TestWiki()
    {
        driver.get("https://wikipedia.org");

        MenuPage menuPage = new MenuPage(driver);
        MainPage mainPage = menuPage.ClickEnglishButton();

        Assertions.assertEquals("Welcome to Wikipedia,", mainPage.GetLabel());
    }
}
