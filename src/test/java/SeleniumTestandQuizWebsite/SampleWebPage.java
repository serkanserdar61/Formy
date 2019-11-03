package SeleniumTestandQuizWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebPage {
    WebDriver driver;

    @Test
    public void GetTitleOfPage(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testandquiz.com/selenium/testing.html");
        //Store variale ,
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Sample Test Page");
        WebElement inputBox = driver.findElement(By.name("firstName"));
        inputBox.sendKeys("Code Test");
        String result = inputBox.getAttribute("value");
        Assert.assertEquals(result,"Code Test");
        System.out.println(result);
    }
    @Test
    public void GetColorOfButton(){
        GetTitleOfPage();
        WebElement button=driver.findElement(By.id("idOfButton"));
        button.click();
        String color=button.getCssValue("color");
        System.out.println(color);
        String color2=button.getCssValue("background-color");
        driver.findElement(By.id("idOfButton")).getCssValue("background-color");
        System.out.println(color2);
        driver.close();
    }

}
