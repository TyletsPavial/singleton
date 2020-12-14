package com.task;

public class MyRobot implements Robot {
    private String action;
    private String place;

    private MyRobot() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void doSomething() {
        System.out.println("I'm " + action + " in the " + place + " now");
    }
}
