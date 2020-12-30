package com.accenture.test.automation.pageobjects;

import com.accenture.fwk.DataSteps;
import com.accenture.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PriceOptionPage extends BasePage {

  private WebElement element;
  private static final String ID_BTN_NEXT = "nextsendquote";
  private static final String CSS_SELECTOR_RADIO_PRICE = "input[value='%s']";

  public PriceOptionPage(DataSteps dataSteps) {
    super(dataSteps);
  }

  public void clickRadioBtnPriceOption(String priceOption, String dataContainerName)
      throws Exception {
    element =
            findElement(
                    By.cssSelector(String.format(CSS_SELECTOR_RADIO_PRICE, priceOption)), dataContainerName);
    selectCheckboxOrRadioButton(element, priceOption);

  }

  public void clickNextBtn(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_BTN_NEXT), dataContainerName);
    click(element);
  }
}
