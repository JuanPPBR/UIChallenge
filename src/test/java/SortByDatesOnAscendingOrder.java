import Pages.HomePage;
import Pages.MovieTopRatedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class SortByDatesOnAscendingOrder extends Hooks{
    @Test
    public void SortByDatesOnAscendingOrder() throws ParseException, InterruptedException {

        HomePage homePage = new HomePage(driver);
        MovieTopRatedPage movieTopRatedPage = new MovieTopRatedPage(driver);

        homePage.clickMovieButton();
        homePage.clickTopRatedInDropMenu();

        movieTopRatedPage.clickInDropdownMenuSort();
        movieTopRatedPage.selectReleaseDateAscending();
        movieTopRatedPage.clickSearchButton();


        Assert.assertTrue(movieTopRatedPage.checkReleaseDateAscending());
    }
}
