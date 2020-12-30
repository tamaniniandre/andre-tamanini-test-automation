package com.accenture.test.automation.steps;

import com.accenture.fwk.DataSteps;
import com.accenture.test.automation.pageobjects.InsurantDataPage;
import com.accenture.test.automation.pageobjects.PriceOptionPage;
import com.accenture.test.automation.pageobjects.ProductDataPage;
import com.accenture.test.automation.pageobjects.VehicleDataPage;
import io.cucumber.java.en.And;

public class EnterInsurantDateSteps {

    DataSteps dataSteps;
    InsurantDataPage insurantDataPage;

    public EnterInsurantDateSteps(DataSteps dataSteps) {
        this.dataSteps = dataSteps;
        insurantDataPage = new InsurantDataPage(dataSteps);
    }

    @And("entered insurant entire data")
    public void enteredInsuranteEntireData() throws Exception {
        insurantDataPage.typeFirstNameRandomValue("First Name");
        insurantDataPage.typeLastNameRandomValue("Last Name");
        insurantDataPage.typeDateOfBirthRandomValue("Date of Birth");
        insurantDataPage.clickRadioBtnGender("Male","Date of Birth");
        insurantDataPage.typeStreetAddressRandomValue("Street Address");
        insurantDataPage.selectRandomCountryValue("Country");
        insurantDataPage.typeZipCodeRandomValue("Zip Code");
        insurantDataPage.typeCityRandomValue("City");
        insurantDataPage.selectOccupationValue("Occupation");
        insurantDataPage.clickHobbiesValues("Hobbies", "Speeding","Bungee Jumping","Cliff Diving","Skydiving");
        insurantDataPage.typeWebSiteRandomValue("Web Site");
        insurantDataPage.clickNextBtn("Next (Enter Product Data)");
    }
}
