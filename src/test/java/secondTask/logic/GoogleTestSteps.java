package secondTask.logic;

import secondTask.BrowserImpl;
import secondTask.pages.GooglePageSteps;

public class GoogleTestSteps
{
    private final BrowserImpl browser = new BrowserImpl();
    private final GooglePageSteps googlePageSteps = new GooglePageSteps(browser);


    public void goToMainPage()
    {
        browser.getDriver();
        browser.openURL("https://www.google.ru/");
    }


    public void afterRun()
    {
        browser.quit();
    }


    public void enterRequest(String text)
    {
        googlePageSteps.enterRequest(text);
    }


    public void checkSearchResult()
    {
        googlePageSteps.checkSearchResult();
    }


    public void placeСursorOnSearchInput()
    {
        googlePageSteps.placeСursorOnSearchInput();
    }

    public void checkEmptyResult(){
        googlePageSteps.clickOnLogo();
        googlePageSteps.checkEmptyResult();
    }
}
