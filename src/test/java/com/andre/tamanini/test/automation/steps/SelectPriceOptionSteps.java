package com.andre.tamanini.test.automation.steps;

import com.andre.tamanini.fwk.DataSteps;
import com.andre.tamanini.test.automation.pageobjects.PriceOptionPage;
import io.cucumber.java.en.When;

public class SelectPriceOptionSteps {

    DataSteps dataSteps;
    PriceOptionPage priceOptionPage;

    public SelectPriceOptionSteps(DataSteps dataSteps) {
        this.dataSteps = dataSteps;
        priceOptionPage = new PriceOptionPage(dataSteps);
    }
    @When("selected the price option {string}")
    public void selectedThePriceOption(String priceOption) throws Exception {
        priceOptionPage.clickRadioBtnPriceOption(priceOption,"Price Option");
        priceOptionPage.clickNextBtn("Next (Send Quote)");
    }

}
