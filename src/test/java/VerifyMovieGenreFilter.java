import Pages.HomePage;
import Pages.MoviePage;
import Pages.MovieTopRatedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMovieGenreFilter extends Hooks{
    @Test
    public void VerifyMovieGenreFilter() throws InterruptedException {

        String genre = "Action";

        HomePage homePage = new HomePage(driver);
        MovieTopRatedPage movieTopRatedPage = new MovieTopRatedPage(driver);
        MoviePage moviePage = new MoviePage(driver);

        homePage.clickMovieButton();
        homePage.clickTopRatedInDropMenu();

        movieTopRatedPage.clickFilterButton();
        movieTopRatedPage.clickActionButton();
        movieTopRatedPage.clickFilterButton();
        movieTopRatedPage.clickSearchButton();
        movieTopRatedPage.clickSearchButtonByAction();
        movieTopRatedPage.selectMovie(6);

        Assert.assertTrue(moviePage.getGenres(genre));
    }
}
