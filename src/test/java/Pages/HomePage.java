package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By loginBy = By.xpath("//div[@class='flex']//a[@href='/login']");
    private By searchBarBy = By.id("inner_search_v4");
    private By searchButttonBy = By.xpath("//div[@class='search']//form//input[@type='submit']");
    private By movieButtonBy = By.xpath("//li[@class='k-item k-menu-item k-state-default k-first']");
    private By topRatedInDropdownMenuBy = By.xpath("//li[@class='k-item k-menu-item k-state-default k-last']//a[@href='/movie/top-rated']");
    private By movieCardBy = By.xpath("//div[@class='card style_1']/div/div/a[@href='/movie/568124']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginButton(){
        driver.findElement(loginBy).click();
    }

    public void clickSearchButton(){
        driver.findElement(searchButttonBy).click();
    }

    public void clickMovieButton(){
        driver.findElement(movieButtonBy).click();
    }

    public void clickTopRatedInDropMenu(){
        driver.findElement(topRatedInDropdownMenuBy).click();
    }

    public void typingInSearchBar(String search){
        driver.findElement(searchBarBy).sendKeys(search);
    }

    public void clickMovieCard(){
        driver.findElement(movieCardBy).click();
    }
}

