package FormyTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyCheckBoxTestCase extends CheckBox {

    @Test

    public void NavigateToCheckboxLink() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/");
        Thread.sleep(3000);
        navigateToDesiredLink("Checkbox");

        closeChromeBrowser();


    }

    @Test
    public void clickable() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/");
        Thread.sleep(3000);
        navigateToDesiredLink("Checkbox");
        clickdesirecheckbox("checkbox1");
        clickdesirecheckbox("checkbox2");

    }
}


