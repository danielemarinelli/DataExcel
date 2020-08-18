import core.BrowserUtility;
import core.ExcelDataProvider;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReadExcelTestData {

    private WebDriver driver = null;

    @Test
    public void test1() throws IOException, InterruptedException {
        List<Map<String,String>> testDataInMap=ExcelDataProvider.getTestDataInMap();

        driver = BrowserUtility.getDriver(testDataInMap.get(0).get("Browser"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(testDataInMap.get(0).get("Keywords"));
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(testDataInMap.get(0).get("UserName"));
        System.out.println(testDataInMap.get(0).get("Password"));
        driver.quit();
    }


    @Test
    public void test2() throws IOException, InterruptedException {
        List<Map<String,String>> testDataInMap=ExcelDataProvider.getTestDataInMap();

        driver = BrowserUtility.getDriver(testDataInMap.get(1).get("Browser"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(testDataInMap.get(1).get("Keywords"));
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        /*driver.findElement(By.xpath(".//h3[contains(text(),'accedi')]/..")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//input[@id='session_key']")).sendKeys(testDataInMap.get(1).get("UserName"));
        driver.findElement(By.xpath(".//input[@id='session_password']")).sendKeys(testDataInMap.get(1).get("Password"));
        */System.out.println(testDataInMap.get(1).get("UserName"));
        System.out.println(testDataInMap.get(1).get("Password"));
        driver.quit();
    }
    @Test
    public void test3() throws IOException, InterruptedException {
        List<Map<String,String>> testDataInMap=ExcelDataProvider.getTestDataInMap();

        driver = BrowserUtility.getDriver(testDataInMap.get(2).get("Browser"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(testDataInMap.get(2).get("Keywords"));
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(testDataInMap.get(2).get("UserName"));
        System.out.println(testDataInMap.get(2).get("Password"));
        driver.quit();
    }
    @Test
    public void test4() throws IOException, InterruptedException {
        List<Map<String,String>> testDataInMap=ExcelDataProvider.getTestDataInMap();

        driver = BrowserUtility.getDriver(testDataInMap.get(3).get("Browser"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(testDataInMap.get(3).get("Keywords"));
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(testDataInMap.get(3).get("UserName"));
        System.out.println(testDataInMap.get(3).get("Password"));
        driver.quit();
    }

    //@Test
    public void test5() throws IOException, InterruptedException {
        List<Map<String,String>> testDataInMap=ExcelDataProvider.getTestDataInMap();

        driver = BrowserUtility.getDriver(testDataInMap.get(4).get("Browser"));
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(testDataInMap.get(4).get("Keywords"));
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(testDataInMap.get(4).get("UserName"));
        System.out.println(testDataInMap.get(4).get("Password"));
        driver.quit();
    }

    @Test
    public void printExcelDataToConsole() throws Exception {
        ExcelDataProvider.readFromExcelFile();

    }

    @Test
    public void writeToExcelData() throws Exception {
        ExcelDataProvider.createAndWriteExcelFile();
    }

}
