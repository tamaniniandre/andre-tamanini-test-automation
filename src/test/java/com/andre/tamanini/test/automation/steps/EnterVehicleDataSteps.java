package com.andre.tamanini.test.automation.steps;

import com.andre.tamanini.fwk.DataSteps;
import com.andre.tamanini.test.automation.pageobjects.PriceOptionPage;
import com.andre.tamanini.test.automation.pageobjects.ProductDataPage;
import com.andre.tamanini.test.automation.pageobjects.VehicleDataPage;
import io.cucumber.java.en.Given;

public class EnterVehicleDataSteps {

  DataSteps dataSteps;
  VehicleDataPage vehicleDataPage;
  ProductDataPage productDataPage;
  PriceOptionPage priceOptionPage;

  public EnterVehicleDataSteps(DataSteps dataSteps) {
    this.dataSteps = dataSteps;
    vehicleDataPage = new VehicleDataPage(dataSteps);
    productDataPage = new ProductDataPage(dataSteps);
    priceOptionPage = new PriceOptionPage(dataSteps);
  }

  @Given("that entered vehicle entire data")
  public void theEnteredVehicleEntireData() throws Exception {
    vehicleDataPage.selectMakeRandomValue("Make");
    vehicleDataPage.selectModelRandomValue("Model");
    vehicleDataPage.typeCylinderCapacityRandomValue("Cylinder Capacity [ccm]");
    vehicleDataPage.typeEnginePerfomanceRandomValue("Engine Performance [kW]");
    vehicleDataPage.typeDateOfManufactureRandomValue("Date of Manufacture");
    vehicleDataPage.selectNumberOfSeatsRandomValue("Number of Seats");
    vehicleDataPage.clickRadioBtnRightHandDriver("Yes", "Right Hand Drive");
    vehicleDataPage.selectNumberOfSeatsMotorcycleRandomValue("Number of Seats Motorcycle");
    vehicleDataPage.selectFuelTypeRandomValue("Fuel Type");
    vehicleDataPage.typePayloadRandomValue("Payload [kg]");
    vehicleDataPage.typeTotalWeightRandomValue("Total Weight [kg]");
    vehicleDataPage.typeListPriceRandomValue("List Price [$]");
    vehicleDataPage.typeLicensePlateNumberValue("TWO-201", "License Plate Number");
    vehicleDataPage.typeAnnualMileageRandomValue("Annual Mileage [mi]");
    vehicleDataPage.clickNextBtn("Next (Enter Insurant Data)");
  }
}
