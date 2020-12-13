package com.task;

public class Main {
    public static void main(String[] args) throws Exception {
        Robot robot = ObjectFactory.getInstance(Robot.class);
        robot.setAction("running");
        Robot mySecondRobot = ObjectFactory.getInstance(Robot.class);
        mySecondRobot.setPlace("park");

        robot.doSomething();
    }
}
