package com.accenture.test.automation.pageobjects;

import com.accenture.fwk.helpers.utils.Utils;
import com.accenture.fwk.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class VehicleDataPage extends BasePage {

  private WebElement element;

  public void selectMakeRandomValue() throws Exception {
    element = findElement(By.id("make"), "Make");
    selectByRandomValue(element);
  }

  public void selectModelRandomValue() throws Exception {
    element = findElement(By.id("model"), "Model");
    selectByRandomValue(element);
  }

  public void typeCylinderCapacityRandomValue() throws Exception {
    element = findElement(By.id("cylindercapacity"), "Cylinder Capacity [ccm]");
    type(element, Utils.generateRandomIntBetweenTwoValues(1, 2000));
  }

  public void typeEnginePerfomanceRandomValue() throws Exception {
    element = findElement(By.id("engineperformance"), "Engine Performance [kW]");
    type(element, Utils.generateRandomIntBetweenTwoValues(1, 2000));
  }

  public void typeDateOfManufactureRandomValue() throws Exception {
    element = findElement(By.id("dateofmanufacture"), "Date of Manufacture");
    type(element, Utils.genaretePastDateIn(360, TimeUnit.DAYS));
  }

  public void selectNumberOfSeatsRandomValue() throws Exception {
    element = findElement(By.id("numberofseats"), "Number of Seats");
    selectByRandomValue(element);
  }

  public void selectRadioBtnRightHandDriver(String value) throws Exception {
    switch (value.toUpperCase()) {
      case "YES":
        element = findElement(By.id("righthanddriveyes"), "Right Hand Drive Yes");
        break;
      case "NO":
        element = findElement(By.id("righthanddriveno"), "Right Hand Drive No");
        break;
      default:
        throw new Exception("VThe value was not available for radio button: " + value);
    }
    selectCheckbox(element, value);
  }

    public void selectNumberOfSeatsMotorcycleRandomValue() throws Exception {
        element = findElement(By.id("numberofseatsmotorcycle"), "Number of Seats Motorcycle");
        selectByRandomValue(element);
    }

    public void selectFuelTypeRandomValue() throws Exception {
        element = findElement(By.id("fuel"), "Fuel Type");
        selectByRandomValue(element);
    }
    public void typePayloadRandomValue() throws Exception {
        element = findElement(By.id("payload"),  "Payload [kg]");
        type(element, Utils.generateRandomIntBetweenTwoValues(1, 1000));
    }
    public void typeTotalWeightRandomValue() throws Exception {
        element = findElement(By.id("totalweight"), "Total Weight [kg]");
        type(element, Utils.generateRandomIntBetweenTwoValues(100, 50000));
    }
    public void typeListPriceRandomValue() throws Exception {
        element = findElement(By.id("listprice"), "List Price [$]");
        type(element, Utils.generateRandomIntBetweenTwoValues(100, 50000));
    }
    public void typeLicensePlateNumbeValue(String value) throws Exception {
        element = findElement(By.id("licenseplatenumber"), "License Plate Number");
        type(element, value);
    }
    public void typeAnnualMileageRandomValue() throws Exception {
        element = findElement(By.id("annualmileage"), "Annual Mileage [mi]");
        type(element, Utils.generateRandomIntBetweenTwoValues(100, 100000));
    }
    public void clickNextBtn() throws Exception {
        element = findElement(By.id("nextenterinsurantdata"), "Next (Enter Insurant Data)");
        click(element);
    }

}

