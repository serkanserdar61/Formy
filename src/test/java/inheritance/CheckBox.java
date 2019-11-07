package inheritance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {

    WebDriver driver;
    public void GoToTheFormyWebPage(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/");

    }

    public void clickbuttontest(String Checkbox) throws InterruptedException {
        List<WebElement> button=driver.findElements(By.xpath("/html/body/div/div/li[3]/a"));

        for(WebElement each:button){
            if(each.getText().equalsIgnoreCase(Checkbox)) {
                each.click();
                Thread.sleep(3000);
                break;
            } else{
                System.out.println("I did not found a button for click");
            }
        }
    }

    public void eachboxes() throws InterruptedException {
        List<WebElement>eachone=driver.findElements(By.xpath("/html/body/div/div/div/div"));

        for(int i=0;i<eachone.size();i++){
            Thread.sleep(3000);
            String result=  eachone.get(i).getText();
            System.out.println(result);
        }
    }


    public void clickable(){
        List<WebElement>clk=driver.findElements(By.xpath("/html/body/div/div/div/div/input"));
        for(int i=0;i<clk.size();i++){
            clk.get(i).click();
        }
    }
}

