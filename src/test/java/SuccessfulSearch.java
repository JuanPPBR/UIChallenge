import Pages.HomePage;
import Pages.SearchQueryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulSearch extends Hooks {
    @Test
    public void SuccessfulSearch() {

        String tittleMovie = "Fight Club";
        HomePage homePage = new HomePage(driver);
        SearchQueryPage searchQueryPage = new SearchQueryPage(driver);

        homePage.typingInSearchBar(tittleMovie);
        homePage.clickSearchButton();

        Assert.assertEquals(searchQueryPage.tittleFirstMove(), tittleMovie);
    }
}
