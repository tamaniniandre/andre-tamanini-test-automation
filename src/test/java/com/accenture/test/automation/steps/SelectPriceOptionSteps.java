package com.accenture.test.automation.steps;

import com.accenture.fwk.DataSteps;
import com.accenture.test.automation.pageobjects.PriceOptionPage;
import com.accenture.test.automation.pageobjects.ProductDataPage;
import com.accenture.test.automation.pageobjects.VehicleDataPage;
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
