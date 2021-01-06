package secondTask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import secondTask.BrowserImpl;
import secondTask.locators.GoogleUI;

public class GooglePageSteps
{

    private final BrowserImpl browser;
    private final GoogleUI ui = new GoogleUI();

    public GooglePageSteps(BrowserImpl browser){
        this.browser = browser;
    }

    public void enterRequest(String text)
    {
        browser.getDriver().findElement(By.xpath(ui.searchInput)).sendKeys(text);
        browser.getDriver().findElement(By.xpath(ui.searchInput)).sendKeys(Keys.ENTER);
    }

    public void checkSearchResult(){
        browser.getDriver().findElement(By.xpath(ui.resultLastName)).isDisplayed();
    }

    public void placeСursorOnSearchInput(){
        Assert.assertEquals(browser.getDriver().findElement(By.xpath(ui.searchInput)).getAttribute("title"), "Шукаць");
    }

    public void clickOnLogo(){
        browser.getDriver().findElement(By.xpath(ui.logo)).click();
    }

    public void checkEmptyResult(){
        browser.getDriver().findElement(By.xpath(ui.searchInput)).isDisplayed();
    }
}
