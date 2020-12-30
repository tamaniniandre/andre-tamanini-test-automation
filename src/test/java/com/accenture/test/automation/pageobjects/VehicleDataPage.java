package com.accenture.test.automation.pageobjects;

import com.accenture.fwk.DataSteps;
import com.accenture.fwk.helpers.utils.FakeDatas;
import com.accenture.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VehicleDataPage extends BasePage {

  private WebElement element;
  private static final String ID_SELECT_MAKE = "make";
  private static final String ID_SELECT_MODEL = "model";
  private static final String ID_INPUT_CYLINDER_CAPACITY = "cylindercapacity";
  private static final String ID_INPUT_ENGINE_PERFOMANCE = "engineperformance";
  private static final String ID_INPUT_DATE_MANUFACTURE = "dateofmanufacture";
  private static final String ID_SELECT_NUMBER_OF_SEATS = "numberofseats";
  private static final String ID_CHECK_RIGHT_HAND_DRIVER_YES = "righthanddriveyes";
  private static final String ID_CHECK_RIGHT_HAND_DRIVER_NO = "righthanddriveno";
  private static final String ID_SELECT_NUMBER_OF_SEATS_MOTORCYCLE = "numberofseatsmotorcycle";
  private static final String ID_SELECT_FUEL = "fuel";
  private static final String ID_INPUT_PAYLOAD = "payload";
  private static final String ID_INPUT_WEIGHT = "totalweight";
  private static final String ID_INPUT_LIST_PRICE = "listprice";
  private static final String ID_INPUT_LICENSE_PLATE_NUMBER = "licenseplatenumber";
  private static final String ID_INPUT_ANNUAL_MILEAGE = "annualmileage";
  private static final String ID_BTN_NEXT = "nextenterinsurantdata";

    public VehicleDataPage(DataSteps dataSteps) {
        super(dataSteps);
    }

  public void selectMakeRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_MAKE), dataContainerName);
    selectByRandomValue(element);
  }

  public void selectModelRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_MODEL), dataContainerName);
    selectByRandomValue(element);
  }

  public void typeCylinderCapacityRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_CYLINDER_CAPACITY), dataContainerName);
    type(element, FakeDatas.generateRandomIntBetweenTwoValues(1, 2000));
  }

  public void typeEnginePerfomanceRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_ENGINE_PERFOMANCE), dataContainerName);
    type(element, FakeDatas.generateRandomIntBetweenTwoValues(1, 2000));
  }

  public void typeDateOfManufactureRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_INPUT_DATE_MANUFACTURE), dataContainerName);
    type(element, FakeDatas.plusMonthsDaysAndYearsToCurrentDate(0,0, -1));
  }

  public void selectNumberOfSeatsRandomValue(String dataContainerName) throws Exception {
    element = findElement(By.id(ID_SELECT_NUMBER_OF_SEATS), dataContainerName);
    selectByRandomValue(element);
  }

  public void clickRadioBtnRightHandDriver(String value, String dataContainerName) throws Exception {
    switch (value.toUpperCase()) {
      case "YES":
        element = findElement(By.id(ID_CHECK_RIGHT_HAND_DRIVER_YES), dataContainerName);
        break;
      case "NO":
        element = findElement(By.id(ID_CHECK_RIGHT_HAND_DRIVER_NO), dataContainerName);
        break;
      default:
        throw new Exception("The value was not available for radio button: " + value);
    }
    selectCheckboxOrRadioButton(element, value);
  }

    public void selectNumberOfSeatsMotorcycleRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_SELECT_NUMBER_OF_SEATS_MOTORCYCLE), dataContainerName);
        selectByRandomValue(element);
    }

    public void selectFuelTypeRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_SELECT_FUEL), dataContainerName);
        selectByRandomValue(element);
    }
    public void typePayloadRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_PAYLOAD),  dataContainerName);
        type(element, FakeDatas.generateRandomIntBetweenTwoValues(1, 1000));
    }

    public void typeTotalWeightRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_WEIGHT), dataContainerName);
        type(element, FakeDatas.generateRandomIntBetweenTwoValues(100, 50000));
    }
    public void typeListPriceRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_LIST_PRICE), dataContainerName);
        type(element, FakeDatas.generateRandomIntBetweenTwoValues(100, 50000));
    }
    public void typeLicensePlateNumberValue(String value, String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_LICENSE_PLATE_NUMBER), dataContainerName);
        type(element, value);
    }
    public void typeAnnualMileageRandomValue(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_INPUT_ANNUAL_MILEAGE), dataContainerName);
        type(element, FakeDatas.generateRandomIntBetweenTwoValues(100, 100000));
    }
    public void clickNextBtn(String dataContainerName) throws Exception {
        element = findElement(By.id(ID_BTN_NEXT), dataContainerName);
        click(element);
    }

}

