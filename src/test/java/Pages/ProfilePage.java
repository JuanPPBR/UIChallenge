package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;

    private By contentWrapperBy = By.xpath("//div[@class='content_wrapper flex']//a");

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }
    public String contentWrapper(){
        return driver.findElement(contentWrapperBy).getText();
    }

}
