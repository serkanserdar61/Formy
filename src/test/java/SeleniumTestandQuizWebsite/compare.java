package SeleniumTestandQuizWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compare {

    WebDriver driver;

    @Test
            public  void compareinfo() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(3000);
       WebElement input=driver.findElement(By.id("username"));
        input.sendKeys("serkanserdar@gmail.com");
        Assert.assertEquals("serkanserdar@gmail.com","serkanserdar@gmail.com");
        String result=input.getAttribute("value");
        Assert.assertEquals("serkanserdar@gmail.com","serkanserdar@gmail.com");
        System.out.println(result);
        Thread.sleep(3000);
        WebElement input2=driver.findElement(By.id("password"));
        input2.sendKeys("123456");
        String result2=input2.getAttribute("value");
        Assert.assertEquals("123456","123456");
        System.out.println(result2);

}
}