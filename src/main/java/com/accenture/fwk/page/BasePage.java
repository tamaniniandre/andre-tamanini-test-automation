package com.accenture.fwk.page;
import com.accenture.fwk.DataSteps;
import com.accenture.fwk.driverfactory.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class BasePage extends BaseValidates {

    public WebDriver driver;
    public String elementName;
    public DataSteps dataSteps;

    public BasePage(DataSteps dataSteps){
        this.dataSteps = dataSteps;
        this.driver = DriverFactory.getDriver();
        waitForLoad();
    }

    public void click(WebElement element) throws Exception {
        validateIfTheElementIsNotNull(element,elementName);
        waitElementClickable(element);
        element.click();
    }
    public void moveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void type(WebElement element, String value) throws Exception {
        validateIfTheElementIsNotNull(element,elementName);
        waitElementClickable(element);
        element.sendKeys(Keys.chord(Keys.CONTROL+"a"),value);
        softAssertEquals(value, element.getText());
        dataSteps.container.put(elementName, value);
    }

    public void selectByVisibleText(WebElement element, String value) throws Exception {
        validateIfTheElementIsNotNull(element,elementName);
        Select select = new Select(element);
        select.selectByVisibleText(value);
        softAssertEquals(value, select.getFirstSelectedOption().getText());
        dataSteps.container.put(elementName, value);
    }
    public void selectByRandomValue(WebElement element) throws Exception {
        validateIfTheElementIsNotNull(element,elementName);
        Random random = new Random();
        Select select = new Select(element);
        int randomValue = random.nextInt(select.getOptions().size()-1)+1;
        select.selectByIndex(randomValue);
        softAssertEquals(select.getOptions().get(randomValue).getText(), select.getFirstSelectedOption().getText());
        dataSteps.container.put(elementName, select.getOptions().get(randomValue).getText());
    }
    public void selectCheckboxOrRadioButton(WebElement element, String value) throws Exception {
        validateIfTheElementIsNotNull(element,elementName);
        Actions actions = new Actions(this.driver);
        actions.click(element).build().perform();
        softAssertEquals(value, element.getAttribute("value"));
        dataSteps.container.put(elementName, value);
    }

    public WebElement tryFindElement(By by, String elementName){
        try{
            this.elementName = elementName;
            return driver.findElement(by);
        }catch (NoSuchElementException e){
            return null;
        }
    }
    public WebElement findElement(By by, String elementName) throws Exception {
        try{
            this.elementName = elementName;
            return driver.findElement(by);
        }catch (NoSuchElementException e){
            throw new Exception("The element was not found: "+this.elementName);
        }
    }
    public WebElement findElementFromElement(By by, WebElement element, String elementName, boolean throwException) throws Exception {
        try{
            this.elementName = elementName;
            return element.findElement(by);
        }catch (NoSuchElementException e){
            if(throwException)
                throw new Exception("The element was not found: "+elementName);
            else
                return null;
        }
    }
    public List<WebElement> findListElementsFromElement(By by, WebElement element, String elementName) throws Exception {
        try{
            this.elementName = elementName;
            return element.findElements(by);
        }catch (NoSuchElementException e){
            throw new Exception("The element was not found: "+elementName);
        }
    }

}
