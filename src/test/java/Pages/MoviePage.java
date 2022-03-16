package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage {

    private WebDriver driver;
    private By genresBy = By.xpath("//span[@class='genres']");
    private By actorCardBy = By.xpath("//ol/li[@class='card']");
    private By titleMovieBy = By.xpath("//div[@class='title ott_true']//a");

    public MoviePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean getGenres(String genre){
        String movie = driver.findElement(genresBy).getText();
        String[] genres = movie.split(", ");
        boolean flag = false;
        for (String s : genres) {
            if (s.equals(genre)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void clickActor(){
        driver.findElements(actorCardBy).get(0).click();
    }

    public String getTitleMovie(){
        return driver.findElements(titleMovieBy).get(0).getText();
    }
}
