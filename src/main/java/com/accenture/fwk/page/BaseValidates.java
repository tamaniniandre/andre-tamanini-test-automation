package com.accenture.fwk.page;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class BaseValidates extends BaseWaits {

    public void validateIfTheElementIsNotNull(WebElement element, String elementName) throws Exception {
        if(element == null){
            throw new Exception("O elemento não foi encontrado: "+elementName);
        }
    }

    public void softAssertEquals(String expected, String real){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expected,real, "Os valores não são iguais. \nEsperado: "+expected+"\n Real:"+real);
    }
    public void assertEquals(String expected, String real){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expected,real, "Os valores não são iguais. \nEsperado: "+expected+"\n Real:"+real);
    }
}
