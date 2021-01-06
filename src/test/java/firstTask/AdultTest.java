package firstTask;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdultTest
{
    @DataProvider
    public Object[][]DataProvider() {
        return new Object[][]{
                { "1990-01-01", true },{ "2019-01-01", false },
                { "25-12-1992", true },{ "25-12-2020", false },
                { "03-25-1993", true },{ "03-25-2018", false },
                { "04/20/1994", true },{ "04/20/2018", false },
                { "20/01/1994", true },{ "20/01/2019", false }
        };
    }

    @Test(dataProvider = "DataProvider")
    public void checkAgeTest(final String dateOfBirth, final boolean is18){
        Assert.assertEquals(new Adult().is18Age(dateOfBirth), is18);
    }
}
