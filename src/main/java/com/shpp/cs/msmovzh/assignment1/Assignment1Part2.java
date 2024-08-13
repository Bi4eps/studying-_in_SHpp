package com.shpp.cs.msmovzh.assignment1;

public class Assignment1Part2 extends SuperKarel{
    public void run() throws Exception {
        fixTheColumn();
        goToFloor();
        while (frontIsClear()) {
            moveToNextColumn();
            fixTheColumn();
            goToFloor();
        }
    }

    private void fixTheColumn() throws Exception {
        turnLeft();
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }

        if (noBeepersPresent()) {
            putBeeper();
        }
    }

    private void goToFloor() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    private void moveToNextColumn() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }
}