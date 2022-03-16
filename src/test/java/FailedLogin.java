import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedLogin extends Hooks{
    @Test
    public void FailedLogin(){

        String username = "JuanPPB";
        String invalidPassword = "qwer1234";

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickLoginButton();
        loginPage.typingUsername(username);
        loginPage.typingPassword(invalidPassword);
        loginPage.clickLoginButton();

        loginPage.waitThereWasAProblem();
        loginPage.typingPassword(invalidPassword);
        loginPage.clickLoginButton();

        loginPage.waitThereWasAProblem();
        loginPage.typingPassword(invalidPassword);
        loginPage.clickLoginButton();

        Assert.assertEquals("You have 7 remaining login attempts.",loginPage.getTextRedBox());

    }
}
