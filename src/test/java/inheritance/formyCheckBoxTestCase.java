package inheritance;

import FormyTest.CheckBox1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class formyCheckBoxTestCase extends CheckBox {



    @Test
    public void clickbuttontestresult () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/");
        Thread.sleep(3000);
        clickbuttontest("Checkbox");
        driver.close();
    }
    @Test
    public void eachboxesresult() throws InterruptedException {
        GoToTheFormyWebPage();
        Thread.sleep(3000);
        clickbuttontest("Checkbox");
        eachboxes();
        driver.close();
    }
    @Test
    public void clikabletest() throws InterruptedException {
        GoToTheFormyWebPage();
        clickbuttontest("Checkbox");
        Thread.sleep(3000);
        clickable();
        driver.close();
    }

}