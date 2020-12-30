package com.accenture.test.automation.steps;

import com.accenture.fwk.DataSteps;
import com.accenture.fwk.page.BasePage;
import com.accenture.test.automation.pageobjects.QuotePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendQuoteSteps extends BasePage {

    DataSteps dataSteps;
    QuotePage quotePage;

    public SendQuoteSteps(DataSteps dataSteps) {
        super(dataSteps);
        quotePage = new QuotePage(dataSteps);
        this.dataSteps = dataSteps;
    }

    @And("entered the quote user information below")
    public void enteredTheQuoteUserInformationBelow(List<Map<String, String>> userInformation) throws Exception {

        quotePage.typeEmailValue(userInformation.get(0).get("E-Mail"), "E-Mail");
        quotePage.typeUsernameValue(userInformation.get(0).get("Username"), "Username");
        quotePage.typePassword(userInformation.get(0).get("Password"), "Password");
        quotePage.typeConfirmPassword(userInformation.get(0).get("Confirm Password"), "Confirm Password");
        quotePage.clickSendBtn("Send");
    }


    @Then("should be shown the following success message {string}")
    public void shouldBeShownTheFollowingSuccessMessage(String expectedMessageSuccess) throws Exception {

        assertEquals(expectedMessageSuccess, quotePage.getSuccessMessage());

    }
}
