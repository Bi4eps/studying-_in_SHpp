package com.shpp.p2p.cs.msmovzh.assignment1;

import com.shpp.karel.KarelTheRobot;

/**
 * Extends the abilities of the {@code KarelTheRobot} class.
 * Designed for use as a parent class instead of the KarelTheRobot.
 */
public class SuperKarel extends KarelTheRobot {
    /**
     * Turns Karel right
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    /**
     * Turns Karel around
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }

    /**
     * Moves Karel one step to the right without changing his facing direction
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void stepToTheRight() throws Exception {
        turnRight();
        move();
        turnLeft();
    }
}