package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchQueryPage {

    private WebDriver driver;

    private By tittleFirstMovieBy = By.xpath("//div[@class='title']//a");

    public SearchQueryPage(WebDriver driver){
        this.driver = driver;
    }

    public String tittleFirstMove(){
        return driver.findElements(tittleFirstMovieBy).get(0).getText();
    }

}
