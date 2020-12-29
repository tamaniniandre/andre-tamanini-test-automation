package com.accenture.fwk.page;

import com.accenture.fwk.driverfactory.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWaits {

    public WebDriver driver;

    public BaseWaits(){
        this.driver = DriverFactory.getDriver();
    }

    public WebElement waitElementVisible(By by) throws Exception {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 50);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }catch (TimeoutException e){
            return null;
        }
    }
    public WebElement waitElementClickable(WebElement element) throws Exception {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        }catch (TimeoutException e){
            return null;
        }
    }
    public void waitForLoad() {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

}
