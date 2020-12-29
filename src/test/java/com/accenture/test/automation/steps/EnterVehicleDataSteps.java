package com.accenture.test.automation.steps;

import com.accenture.test.automation.pageobjects.VehicleDataPage;
import io.cucumber.java.en.Given;

public class EnterVehicleDataSteps {

    VehicleDataPage vehicleDataPage = new VehicleDataPage();

    @Given("the entered vehicle entire data")
    public void queAcionadoOBotaoParaCadastrarFuncionario() throws Exception {
        vehicleDataPage.selectMakeRandomValue();
        vehicleDataPage.selectModelRandomValue();
        vehicleDataPage.typeCylinderCapacityRandomValue();
        vehicleDataPage.typeEnginePerfomanceRandomValue();
        vehicleDataPage.typeDateOfManufactureRandomValue();
        vehicleDataPage.selectNumberOfSeatsRandomValue();
        vehicleDataPage.selectRadioBtnRightHandDriver("Yes");
        vehicleDataPage.selectNumberOfSeatsMotorcycleRandomValue();
        vehicleDataPage.selectFuelTypeRandomValue();
        vehicleDataPage.typePayloadRandomValue();
        vehicleDataPage.typeTotalWeightRandomValue();
        vehicleDataPage.typeListPriceRandomValue();
        vehicleDataPage.typeLicensePlateNumbeValue("TWO-201");
        vehicleDataPage.typeAnnualMileageRandomValue();
        vehicleDataPage.clickNextBtn();
    }
}
