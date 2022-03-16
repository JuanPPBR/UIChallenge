package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    private By usernameTextboxBy = By.id("username");
    private By passwordTextboxBy = By.id("password");
    private By loginButtonBy = By.id("login_button");
    private By thereWasAProblemBy = By.className("carton");
    private By redBoxBy = By.xpath("//div[@class='content']/ul/li['You have 6 remaining login attempts.']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void typingUsername(String username){
        driver.findElement(usernameTextboxBy).sendKeys(username);
    }

    public void typingPassword(String password){
        driver.findElement(passwordTextboxBy).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButtonBy).click();
    }

    public void waitThereWasAProblem(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.numberOfElementsToBe(thereWasAProblemBy, 1));
    }

    public String getTextRedBox(){
        return driver.findElements(redBoxBy).get(1).getText();
    }
}
