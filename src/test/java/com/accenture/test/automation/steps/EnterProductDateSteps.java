package com.accenture.test.automation.steps;

import com.accenture.fwk.DataSteps;
import com.accenture.test.automation.pageobjects.PriceOptionPage;
import com.accenture.test.automation.pageobjects.ProductDataPage;
import com.accenture.test.automation.pageobjects.VehicleDataPage;
import io.cucumber.java.en.And;

public class EnterProductDateSteps {

    DataSteps dataSteps;
    ProductDataPage productDataPage;


    public EnterProductDateSteps(DataSteps dataSteps) {
        this.dataSteps = dataSteps;
        productDataPage = new ProductDataPage(dataSteps);
    }

    @And("entered product entire data")
    public void enteredProductEntireData() throws Exception {
        productDataPage.typeStartDateRandomValue("Start Date");
        productDataPage.selectInsuranceSumRandomValue("Insurance Sum [$]");
        productDataPage.selectMeritRatingRandomValue("Merit Rating");
        productDataPage.selectDamageInsuranceRandomValue("Damage Insurance");
        productDataPage.clickOptionalProductsValues("Optional Products","Euro Protection","Legal Defense Insurance");
        productDataPage.selectCourtesyCarRandomValue("Courtesy Car");
        productDataPage.clickNextBtn("Next (Enter Product Data)");
    }
}
