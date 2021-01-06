package secondTask;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserImpl
{
    WebDriver driver;

    public BrowserImpl(){
        DesiredCapabilities capabilities;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
        //capabilities.setCapability("pageLoadStrategy", "none");

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("drivers/chromedriver"))
                .usingAnyFreePort().build();
        options.merge(capabilities);
        driver = new ChromeDriver(service, options);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openURL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void quit() {
        driver.quit();
    }
}
