package com.houston.jbehavedojo.steps;

public class TrafficController {

    private TrafficLight pedestrianLight = new TrafficLight();
    private TrafficLight carLight = new TrafficLight();
    //private Clock clock = new Clock();

    private int clockTime = 0;
    
    public void advance(int time) {
        this.clockTime += time;
        stateCheck();
    }
    
    private void stateCheck() {
        
        if(clockTime == 3 && carLight.color.equals("yellow")) {
            pedestrianLight.color = "green";
            carLight.color = "red";
            clearTime();
        }
        if(clockTime == 3 && carLight.color.equals("red-yellow")) {
            pedestrianLight.color = "red";
            carLight.color = "green";
            clearTime();
        }
        if(clockTime == 7 && pedestrianLight.color.equals("green")) {
            pedestrianLight.color = "blinking-green";
            carLight.color = "red";
        }
        if(clockTime == 10 && carLight.color.equals("red")) {
            pedestrianLight.color = "red";
            carLight.color = "red-yellow";
            clearTime();
        }
        if(clockTime == 30){
            carLight.color = "yellow";
            pedestrianLight.color = "red";
            clearTime();
          }
        
        
    }
    
    private void clearTime() {
        clockTime = 0;
    }

    public void switchOn() {
        pedestrianLight.color = "red";
        carLight.color = "green";
    }

    public TrafficLight getPedestrianLight() {
        return pedestrianLight;
    }

    public TrafficLight getCarLight() {
        return carLight;
    }
}
