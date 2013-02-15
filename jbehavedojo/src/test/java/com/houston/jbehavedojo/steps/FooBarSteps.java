package com.houston.jbehavedojo.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FooBarSteps {
    
    @Given("I is a pending step")
    public void givenIAmAPendingStep() {
      // PENDING
    }

    @Given("I is still pending step")
    public void givenIAmStillPendingStep() {
      // PENDING
    }

    @When("a bad soul will implement me")
    public void whenAGoodSoulWillImplementMe() {
      // PENDING
    }

    @Then("I should be happy")
    public void thenIShallBeHappy() {
    }

}
