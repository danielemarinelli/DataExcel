package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {

    public static WebDriver getDriver(String browser){
        WebDriver driver = null;
        if(browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/marinellid/Desktop/WizdomQA/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "C:/Users/marinellid/Desktop/WizdomQA/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        return driver;
    }
}
