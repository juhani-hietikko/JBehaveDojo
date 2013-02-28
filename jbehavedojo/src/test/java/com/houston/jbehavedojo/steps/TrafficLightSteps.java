package com.houston.jbehavedojo.steps;

import org.jbehave.core.annotations.*;
import static org.junit.Assert.*;


public class TrafficLightSteps {
    private TrafficController trafficController;
    
    @Given("a crosswalk with traffic lights")
    public void crossWalk() {
        trafficController = new TrafficController();
    }
    
    @When("the traffic lights are switched on")
    public void trafficLightsOn() {
        trafficController.switchOn();
    }
    
    @Then("$color is shown for pedestrians")
    public void colorForPedestrians(String color) {
        assertEquals(color, trafficController.getPedestrianLight().color);
    }
    
    @Then("$color is shown for cars")
    public void colorForCars(String color) {
        assertEquals(color, trafficController.getCarLight().color);
    }
    
    @When("lights are set $color for cars")
    public void colorIsSetForCars(String color) {
        trafficController.getCarLight().color = color;
        
        if (color.equals("red")) {
            trafficController.getPedestrianLight().color = "green";
        } else {
            trafficController.getPedestrianLight().color = "red";
        }
    }
    
    @When("$time seconds pass")
    public void timePassed(int time) {
        trafficController.advance(time);
        
    }
    
    @When("<time> elapsed")
    public void timeElapsed(@Named("time")int time)
    {
        trafficController.advance(time);
    }
}




// Some examples of the syntax:

//@Given("a stock of symbol $symbol and a threshold of $threshold")
//public void aStock(String symbol, double threshold) {
//    // ...
//}
// 
//@When("the stock is traded at $price")
//@Alias("the stock is exchanged at $price") // single alias    
//public void theStockIsTradedAt(double price) {
//    // ...
//}
// 
//@Then("the alert status should be $status")
//@Aliases(values={"the trader should be alerted of status $status",
//                 "the alert status is at $status"}) // multiple aliases    
//public void theAlertStatusShouldBe(String status) {
//    // ...
//}
