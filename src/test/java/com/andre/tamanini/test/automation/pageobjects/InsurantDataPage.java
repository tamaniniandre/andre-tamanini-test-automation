package com.andre.tamanini.test.automation.pageobjects;

import com.andre.tamanini.fwk.DataSteps;
import com.andre.tamanini.fwk.helpers.utils.FakeDatas;
import com.andre.tamanini.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InsurantDataPage extends BasePage {

  private static final String ID_INPUT_FIRST_NAME = "firstname";
  private static final String ID_INPUT_LAST_NAME = "lastname";
  private static final String ID_INPUT_DATE_OF_BIRTH = "birthdate";
  private static final String CSS_SELECTOR_RADIO_GENDER = "input[value='%s']";
  private static final String ID_INPUT_STREET_ADDRESS = "streetaddress";
  private static final String ID_SELECT_COUNTRY = "country";
  private static final String ID_INPUT_ZIP_CODE = "zipcode";
  private static final String ID_INPUT_CITY = "city";
  private static final String ID_SELECT_OCCUPATION = "occupation";
  private static final String CSS_SELECTOR_RADIO_HOBBIES = "input[value='%s']";
  private static final String ID_INPUT_WEBSITE = "website";
  private static final String ID_BTN_NEXT = "nextenterproductdata";

  public InsurantDataPage(DataSteps dataSteps) {
    super(dataSteps);
  }

  public void typeFirstNameRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_FIRST_NAME), dataContainerName);
    type(element, FakeDatas.generateFirstName());
  }

  public void typeLastNameRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_LAST_NAME), dataContainerName);
    type(element, FakeDatas.generateFirstName());
  }

  public void typeDateOfBirthRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_DATE_OF_BIRTH), dataContainerName);
    type(element, FakeDatas.plusMonthsDaysAndYearsToCurrentDate(-1,0, -18));
  }

  public void clickRadioBtnGender(String value, String dataContainerName) throws Exception {
    element =
        findElement(
            By.cssSelector(String.format(CSS_SELECTOR_RADIO_GENDER, value)), dataContainerName);
    selectCheckboxOrRadioButton(element, value);
  }

  public void typeStreetAddressRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_STREET_ADDRESS), dataContainerName);
    type(element, FakeDatas.generateFirstName());
  }

  public void selectRandomCountryValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_COUNTRY), dataContainerName);
    selectByRandomValue(element);
  }

  public void typeZipCodeRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_ZIP_CODE), dataContainerName);
    type(element, "148070");
  }

  public void typeCityRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_CITY), dataContainerName);
    type(element, FakeDatas.generateCity());
  }

  public void selectOccupationValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_OCCUPATION), dataContainerName);
    selectByRandomValue(element);
  }

  public void clickHobbiesValues(String dataContainerName, String... hobbies) throws Exception {
    for (String hobbie : hobbies) {
      element =
          findElement(
              By.cssSelector(String.format(CSS_SELECTOR_RADIO_HOBBIES, hobbie.replace(" ",""))),
              dataContainerName.concat("_").concat(hobbie));
      selectCheckboxOrRadioButton(element, hobbie);
    }
  }
  public void typeWebSiteRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_WEBSITE), dataContainerName);
    type(element, "wwww."+FakeDatas.generateFirstName()+"."+FakeDatas.generateLastName()+".com");
  }

  public void clickNextBtn(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_BTN_NEXT), dataContainerName);
    click(element);
  }
}

