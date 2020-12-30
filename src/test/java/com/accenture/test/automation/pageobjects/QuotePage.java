package com.accenture.test.automation.pageobjects;

import com.accenture.fwk.DataSteps;
import com.accenture.fwk.helpers.utils.FakeDatas;
import com.accenture.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuotePage extends BasePage {

    private WebElement element;
    private static final String ID_INPUT_EMAIL = "email";
    private static final String ID_INPUT_USERNAME = "username";
    private static final String ID_INPUT_PASSWORD = "password";
    private static final String ID_INPUT_CONFIRM_PASSWORD = "confirmpassword";
    private static final String XPATH_SUCCESS_MESSAGE = "//div[contains(@class,'alert')]//h2";
    private static final String ID_BTN_SEND = "sendemail";

    public QuotePage(DataSteps dataSteps) {
        super(dataSteps);
    }
    public void typeEmailValue(String value, String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_EMAIL), dataContainerName);
        type(element, value);
    }
    public void typeUsernameValue(String value, String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_USERNAME), dataContainerName);
        type(element, value);
    }
    public void typePassword(String value, String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_PASSWORD), dataContainerName);
        type(element, value);
    }
    public void typeConfirmPassword(String value, String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_CONFIRM_PASSWORD), dataContainerName);
        type(element, value);
    }
    public void clickSendBtn(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_BTN_SEND), dataContainerName);
        click(element);
    }
    public String getSuccessMessage() throws Exception {
        element = waitElementVisible(By.xpath(XPATH_SUCCESS_MESSAGE));
        return element.getText();
    }
}
