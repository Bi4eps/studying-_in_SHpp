package com.shpp.cs.msmovzh.assignment1;

public class Assignment1Part4 extends SuperKarel {
    public void run() throws Exception {
        putBeeper();
        while (leftIsClear()) {
            fillLine();
            goToNextLine();
        }
        fillLine();
    }

    private void fillLine() throws Exception {
        while (frontIsClear()) {
            moveWithBeeperCheck();
        }
    }

    private void goToNextLine() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnRight();

        moveWithBeeperCheck();

        turnRight();
    }

    private void moveWithBeeperCheck() throws Exception {
        if (beepersPresent()) {
            move();
        } else {
            move();
            putBeeper();
        }
    }
}
