package com.shpp.p2p.cs.msmovzh.assignment1;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    public void stepToTheRight() throws Exception {
        turnRight();
        move();
        turnLeft();
    }
}