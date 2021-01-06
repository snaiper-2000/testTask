package secondTask;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import secondTask.logic.GoogleTestSteps;

public class SearchEngineTest
{
    private GoogleTestSteps googleTestSteps = new GoogleTestSteps();

    @BeforeTest
    public void precondition(){
        googleTestSteps.goToMainPage();
    }


    @Test
    public void searchByName(){
        googleTestSteps.enterRequest("Фамилия");
        googleTestSteps.checkSearchResult();
    }

    @Test
    public void checkTitleForSearchInput(){
        googleTestSteps.placeСursorOnSearchInput();
    }

    @Test
    public void checkEmptyResult(){
        googleTestSteps.enterRequest("Фамилия");
        googleTestSteps.checkEmptyResult();
    }


    @AfterTest
    public void afterRun(){
        googleTestSteps.afterRun();
    }

}
