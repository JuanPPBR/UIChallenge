import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulLogin extends Hooks {
    @Test
    public void SuccessfulLogin(){

        String username = "JuanPPB";
        String password = "Qwer1234";

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);

        homePage.clickLoginButton();
        loginPage.typingUsername(username);
        loginPage.typingPassword(password);
        loginPage.clickLoginButton();

        Assert.assertEquals(profilePage.contentWrapper(), username);

    }

}
