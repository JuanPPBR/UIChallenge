package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class ActorPage {

    private WebDriver driver;
    private By knownForBy = By.xpath("//li[@class='account_adult_false item_adult_false']");

    public ActorPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean checkTimeline(String tittleMovie) {
        int length = driver.findElements(knownForBy).toArray().length;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            if (Objects.equals(driver.findElements(knownForBy).get(i).getText(), tittleMovie)) {
                flag = true;
            }
        }
        return flag;
    }

}
