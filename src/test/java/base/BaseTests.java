package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

//         ** MANAGE WEB-PAGE **
//        int width = 375;
//        int height = 812;
//        driver.manage().window().setSize(new Dimension(width, height));

//        ** FIND ONE ELEMENT **
//        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
//        inputsLink.click();

//        ** FIND MULTIPLE ELEMENTS **
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//         ** PRINT ELEMENT OFF PAGE **
//        System.out.println(driver.getTitle());

//        ====================== TASK =================================
//        1. click on "Shifting Content"
//        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContentLink.click();
////        2. click on the first example
//        WebElement exampleOneLink = driver.findElement(By.linkText("Example 1: Menu Element"));
//        exampleOneLink.click();
////        3. print how many menu elements appear
//        List<WebElement> links = driver.findElements(By.tagName("li"));
//        System.out.println(links.size());

//        driver.quit();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }

}
