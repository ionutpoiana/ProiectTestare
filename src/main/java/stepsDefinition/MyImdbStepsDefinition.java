package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import static java.lang.Thread.sleep;

public class MyImdbStepsDefinition {
    //Open Imbd website
    @Given("Access {string} website")
    public void openImdbWebsite(String pageName) throws InterruptedException {
        StartDriver.setup(pageName);
        sleep(3000);
    }

    //Click buttons
    @Then("Click {string} from header")
    public void clickFromHeader(String button) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@class='ipc-btn__text'][contains(text(),'"+button+"')]"))
                .click();
        sleep(3000);
    }

    // Click Sign in buttons from Sign in page
    @Then("Click {string} button")
    public void clickButton(String buttoSgn) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@class='auth-provider-text'][contains(text(),'"+buttoSgn+"')]"))
                .click();
        sleep(3000);
    }

    // enter email on Sign in page
    @Then("Enter Email {string}")
    public void enterEmail(String email) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("ap_email")).sendKeys(email);
        sleep(3000);
    }

    // enter password on Sign in Page
    @Then("Enter Password {string}")
    public void enterPassword(String passwrd) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("ap_password")).sendKeys(passwrd);
        sleep(3000);
    }

    // select Keep me Signed in.
    @Then("Select Keep me signed in")
    public void selectKeepMeSignedIn() throws InterruptedException {
        StartDriver.getDriver().findElement(By.name("rememberMe")).click();
        sleep(3000);
    }

    //Click on Sign in button
    @Then("Click on Sign in button")
    public void clickOnSignInButton() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("signInSubmit")).click();
        sleep(5000);
    }

    //Wathlist feature
    //Create a new list
    @Then("Click {string} from top-right side")
    public void clickFromTopRightSide(String text1) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//h3[contains(text(),'"+text1+"')]"))
                .click();
        sleep(3000);
    }

    //Enter list title
    @Then("Fill List Title {string}")
    public void fillListTitle(String title) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("list-create-name")).sendKeys(title);
        sleep(3000);
    }

    //Enter List description
    @Then("Fill List Description {string}")
    public void fillListDescription(String descript) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("list-create-description")).sendKeys(descript);
        sleep(3000);
    }

    //Select type of list Images bun then select Titles
    @Then("Select Type of List {string}")
    public void selectTypeOfList(String listtp) throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("list-create-type")).click();
        sleep(2000);
        StartDriver.getDriver().findElement(By.xpath("//option[@value='"+listtp+"']")).click();
        sleep(2000);
    }

    //Uncheck Public list
    @Then("Uncheck Public List")
    public void uncheckPublicList() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//label[@for='list-create-privacy']")).click();
        sleep(3000);
    }

    //Click Create button
    @Then("Click the {string} button")
    public void clickTheButton(String btn) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@type='button'][contains(text(),'"+btn+"')]"))
                .click();
        sleep(3000);
    }

    //Enter watchlist edit mode
    @Then("Enter Edit mode")
    public void enterEditMode() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        sleep(3000);
    }

    // Select first two titles to delete
    @Then("Select {int}, {int}, {int} titles to delete")
    public void selectTitlesToDelete(Integer nr, Integer nrdoi, Integer nrtrei) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("(//div[@name='titleCheck'])["+nr+"]")).click();
        sleep(3000);
        StartDriver.getDriver().findElement(By.xpath("(//div[@name='titleCheck'])["+nrdoi+"]")).click();
        sleep(3000);
        StartDriver.getDriver().findElement(By.xpath("(//div[@name='titleCheck'])["+nrtrei+"]")).click();
        sleep(3000);
    }

    //Delete items
    @Then("Delete items")
    public void deleteItems() throws InterruptedException {
        StartDriver.getDriver().findElement(By.id("delete_items")).click();
        sleep(10000);
        StartDriver.getDriver().findElement(By.xpath("//*[@value='DELETE']")).click();
        sleep(2000);
    }

    //Select title after search
    @Then("Select {string} title")
    public void selectTitle(String title) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[contains(text(),'"+title+"')]"))
                .click();
        sleep(3000);
    }

    // In title page add it to watchlist
    @Then("After the title page is loaded, add the title to Watchlist")
    public void addTheTitleToW() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='tm-box-wl-count']"))
                .click();
        sleep(5000);
    }

    @Then("After the title page is loaded, remove the title from Watchlist")
    public void removeTitleFromW() throws InterruptedException {
        addTheTitleToW();
    }

    // searchFunction.feature
    //Use search function
    @Then("Use the {string} section from header and search for {string}")
    public void useSearchSectionFromHeader(String search, String searchwrd) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@placeholder='"+search+"']"))
                .sendKeys(searchwrd);
        sleep(3000);
        StartDriver.getDriver().findElement(By.xpath("//*[@aria-label='Submit Search']")).click();
        sleep(3000);
    }

    // Test Search suggestions list
    @Then("Use the {string} section and write {string}")
    public void useSearchAndWrite(String search2, String searchwrd2) throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@placeholder='"+search2+"']"))
                .sendKeys(searchwrd2);
        sleep(5000);
    }

    //Select first title of suggestions list
    @Then("Select first title")
    public void selectFistTitle() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@data-testid='search-result--const']"))
                .click();
        sleep(3000);
    }


    // FrontPage feature
    //Go to IMDb front page
    @Then("Go to homepage")
    public void goToHomepage() throws InterruptedException {
        StartDriver.getDriver().get("https://www.imdb.com/?ref_=nv_home");
        sleep(4000);
    }

    //Scroll through front page presentation
    @Then("Scroll through front page presentation")
    public void scrollThroughFrontPagePresentation() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//div[@aria-label='Next slide']"))
                .click();
        sleep(2000);
        StartDriver.getDriver().findElement(By.xpath("//div[@aria-label='Next slide']"))
                .click();
        sleep(2000);
        StartDriver.getDriver().findElement(By.xpath("//div[@aria-label='Previous slide']"))
                .click();
        sleep(2000);
    }

    // Add movies from presentation to watchlist
    @Then("Add movie to watchlist")
    public void addMovieToWatchlist() throws InterruptedException {
        StartDriver.getDriver().findElement(By.xpath("//*[@class='swiper-slide swiper-slide-active']" +
                        "//*[@class='ipc-watchlist-ribbon__icon']")).click();
        sleep(3000);
    }
}