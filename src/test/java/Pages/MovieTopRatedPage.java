package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Integer.parseInt;

public class MovieTopRatedPage {

    private WebDriver driver;

    private By filterButtonBy = By.xpath("//div[@data-callback='filterCallback()']");
    private By actionButtonBy = By.xpath("//li[@data-value='28']");
    private By searchButtonBy = By.xpath("//div[@class='apply small background_color light_blue enabled']");
    private By actionMovieBy = By.xpath("//h2//a[@href='/movie/155']");
    private By movieBy = By.xpath("//div[@class='card style_1']");
    private By dropdownMenuSortBy = By.xpath("//span[@class='k-widget k-dropdown kendo_dropdown full_width font_size_1']");
    private By releaseDateAscendingBy = By.xpath("//ul[@class='k-list k-reset']/li[@data-offset-index='5']");
    private By movieDateBy = By.xpath("//div[@class='content']/p");
    private By oldMovieBy = By.xpath("//h2//a[@href='/movie/160']");

    public MovieTopRatedPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFilterButton(){
        driver.findElement(filterButtonBy).click();
    }

    public void clickActionButton(){
        driver.findElement(actionButtonBy).click();
    }

    public void clickSearchButtonByAction(){
        driver.findElement(searchButtonBy).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.numberOfElementsToBe(actionMovieBy, 1));
    }

    public void selectMovie(int i){
        driver.findElements(movieBy).get(i).click();
    }

    public void clickInDropdownMenuSort(){
        driver.findElement(dropdownMenuSortBy).click();
    }

    public void selectReleaseDateAscending (){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.numberOfElementsToBe(releaseDateAscendingBy, 4));
        driver.findElements(releaseDateAscendingBy).get(0).click();
    }

    public void clickSearchButton(){
        driver.findElement(searchButtonBy).click();
    }

//    public boolean checkReleaseDateAscending() throws ParseException {
//        boolean flag = false;
//        String strDateFormat = "MMM dd, aaaa";
//        SimpleDateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//        for (int i = 0; i < 3; i++){
//            Date date1 = dateFormat.parse(driver.findElements(movieDateBy).get(i).getText());
//            Date date2 = dateFormat.parse(driver.findElements(movieDateBy).get(i + 1).getText());
//            System.out.println(date1);
//            if (date1.before(date2)){
//                flag = true;
//            }
//
//        }
//        return flag;
//    }

    public boolean checkReleaseDateAscending(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.numberOfElementsToBe(oldMovieBy, 1));
        boolean flag = false;
        List<WebElement> dates = driver.findElements(movieDateBy);
        for (int i = 0; i < 6; i++){
            if (Integer.parseInt(dates.get(i + 1).getText().split(", ")[1]) > Integer.parseInt(dates.get(i).getText().split(", ")[1])) {
                flag = true;
            }
        }

        return flag;
    }

}
