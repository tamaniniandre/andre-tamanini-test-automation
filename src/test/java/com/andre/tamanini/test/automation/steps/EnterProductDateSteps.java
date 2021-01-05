package com.andre.tamanini.test.automation.steps;

import com.andre.tamanini.fwk.DataSteps;
import com.andre.tamanini.test.automation.pageobjects.ProductDataPage;
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
