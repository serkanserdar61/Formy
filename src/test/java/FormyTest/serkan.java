package FormyTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;


public class serkan {

    WebDriver driver;

    @Test
    public void button() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://formy-project.herokuapp.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/li[2]/a")).click();
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void verifyingprimarybutton() throws InterruptedException {
        button();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")).click();
        Thread.sleep(5000);
        String text=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")).getText();
        System.out.println(text);

        String PrimaryButton = "/html/body/div/form/div[1]/div/div/button[1]";

        WebElement element = driver.findElement(By.xpath(PrimaryButton));

        if (element.isDisplayed() && element.isEnabled()) {

            element.click();

            System.out.println(element.getText());

        }
    }
    @Test
    public void veriyfyingsuccesbutton() throws InterruptedException {
        button();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]")).click();

        WebElement text=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
        System.out.println(text.getText());

        String primarybutton="/html/body/div/form/div[1]/div/div/button[2]";

        WebElement element=driver.findElement(By.xpath(primarybutton));

        if (element.isDisplayed() && element.isEnabled()) {

            element.click();

            System.out.println(element.getText());

        }
    }
@Test
    public void veriyfyinginfobutton() throws InterruptedException {
             button();
             Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]")).click();

        WebElement info=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
    System.out.println(info.getText());

    String element="/html/body/div/form/div[1]/div/div/button[3]";

    WebElement element1=driver.findElement(By.xpath(element));

    if(element1.isDisplayed() && element1.isEnabled()){
        element1.click();
        System.out.println(element1.getText());
    }

}
@Test
    public void veriyfyingwarningbutton() throws InterruptedException {

        button();

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]")).click();

        WebElement warning=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
    System.out.println(warning.getText());

    Thread.sleep(3000);

    String warn="/html/body/div/form/div[1]/div/div/button[4]";

    WebElement element=driver.findElement(By.xpath(warn));

    Thread.sleep(3000);

    if(element.isDisplayed()&&element.isEnabled()){

        element.click();
        System.out.println(element.getText());
    }

}
 @Test

    public void veryfiyingdangerbutton() throws InterruptedException {
        button();
        Thread.sleep(3000);
              driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]")).click();
        WebElement danger=driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
     System.out.println(danger.getText());

     String dang="/html/body/div/form/div[1]/div/div/button[5]";
     WebElement element=driver.findElement(By.xpath(dang));

     if(element.isDisplayed()&&element.isEnabled()){

         element.click();
         System.out.println(element.getText());
     }
    }
    @Test
    public void veriyfyingleftmiddlerightbutton()throws InterruptedException{
        //This list is for more than one locator and it will store all locator in an array
        Thread.sleep(3000);
        List<WebElement> topButtons = driver.findElements(By.xpath("/html/body/div/form/div[1]/div/div/button"));

        for(WebElement each:topButtons){
            each.click();
            System.out.println(each.getText());
        }

    }
    public void VerifyUsingArrayTopSectionButton() throws InterruptedException {

        java.util.List<WebElement> topButtons = driver.findElements(By.xpath("/html/body/div/form/div[1]/div/div/button"));


        for (int i = 0; i < topButtons.size(); i++) {

            Thread.sleep(2000);

            topButtons.get(i).click();

            System.out.println(topButtons.get(i).getText());

            if (topButtons.get(i).getText().equals("Warning")) {

                topButtons.get(i).click();

                System.out.println(topButtons.get(i).getText());

                break;

            }

        }
    }

        @Test

    public void VerifyPrimaryButton() throws InterruptedException{
        button();
        verifyingprimarybutton();
    }
    @Test

    public void VerifySuccesButton() throws InterruptedException{
        button();
        veriyfyingsuccesbutton();
    }

    @Test
    public void VerifyInfoButton() throws InterruptedException{
        button();
       veriyfyinginfobutton();
    }

    @Test
    public void VerifyDangerButton() throws InterruptedException{
        button();
       veryfiyingdangerbutton();
    }
    @Test
    public void VerifyWarningButton() throws InterruptedException{
        button();
        veriyfyingwarningbutton();
    }
@Test
public void VeriyfyingLeftMiddleRightButton()throws InterruptedException{
        button();
        veriyfyingleftmiddlerightbutton();
}
    @Test

    public void UsingArrayToClickAndGetTextOfButtons() throws InterruptedException {

      button();

        veriyfyingleftmiddlerightbutton();

    }





    @Test

    public void UsingArrayForTopSectionButton() throws InterruptedException {



        button();

        VerifyUsingArrayTopSectionButton();

    }

}
