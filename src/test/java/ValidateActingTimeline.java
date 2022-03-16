import Pages.ActorPage;
import Pages.HomePage;
import Pages.MoviePage;
import Pages.MovieTopRatedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateActingTimeline extends Hooks{
    @Test
    public void ValidateActingTimeline(){

        HomePage homePage = new HomePage(driver);
        MovieTopRatedPage movieTopRatedPage = new MovieTopRatedPage(driver);
        MoviePage moviePage = new MoviePage(driver);
        ActorPage actorPage = new ActorPage(driver);

        homePage.clickMovieButton();
        homePage.clickTopRatedInDropMenu();

        movieTopRatedPage.selectMovie(2);

        String titleMovie = moviePage.getTitleMovie();

        moviePage.clickActor();

        Assert.assertTrue(actorPage.checkTimeline(titleMovie));
    }
}
