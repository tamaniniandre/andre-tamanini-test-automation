package com.andre.tamanini.test.automation.pageobjects;

import com.andre.tamanini.fwk.DataSteps;
import com.andre.tamanini.fwk.helpers.utils.FakeDatas;
import com.andre.tamanini.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductDataPage extends BasePage {

  private static final String ID_INPUT_START_DATE = "startdate";
  private static final String ID_SELECT_INSURANCE_SUM = "insurancesum";
  private static final String ID_SELECT_MERIT_RATING = "meritrating";
  private static final String ID_SELECT_DAMAGE_INSURANCE = "damageinsurance";
  private static final String XPATH_RADIO_GENDER = "//p//label[contains(.,'%s')]";
  private static final String ID_SELECT_COURTESY_CAR = "courtesycar";
    private static final String ID_BTN_NEXT = "nextselectpriceoption";

  public ProductDataPage(DataSteps dataSteps) {
    super(dataSteps);
  }

  public void typeStartDateRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_START_DATE), dataContainerName);
    type(element, FakeDatas.plusMonthsDaysAndYearsToCurrentDate(1,1, 0));
  }

  public void selectInsuranceSumRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_INSURANCE_SUM), dataContainerName);
    selectByRandomValue(element);
  }

  public void selectMeritRatingRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_MERIT_RATING), dataContainerName);
    selectByRandomValue(element);
  }

  public void selectDamageInsuranceRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_DAMAGE_INSURANCE), dataContainerName);
    selectByRandomValue(element);
  }

  public void clickOptionalProductsValues(String dataContainerName, String... optionalProducts)
      throws Exception {
    for (String optionalProduct : optionalProducts) {
      element =
          findElement(
              By.xpath(String.format(XPATH_RADIO_GENDER, optionalProduct)),
              dataContainerName.concat("_").concat(optionalProduct));
      selectCheckboxOrRadioButton(element, optionalProduct);
    }
  }

  public void selectCourtesyCarRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_COURTESY_CAR), dataContainerName);
    selectByRandomValue(element);
  }
    public void clickNextBtn(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_BTN_NEXT), dataContainerName);
        click(element);
    }
}
