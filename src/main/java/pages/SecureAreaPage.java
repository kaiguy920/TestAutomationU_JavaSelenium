package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");
    private By h1Error = By.cssSelector("h1");
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    public String getErrorText(){
        return driver.findElement(h1Error).getText();
    }

}
