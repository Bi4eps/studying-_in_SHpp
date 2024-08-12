package com.shpp.cs.msmovzh.assignment1;

public class Assignment1Part1 extends SuperKarel {
    public void run() throws Exception {
        goToNewspaper();
        pickBeeper();
        goBack();
    }

    private void goToNewspaper() throws Exception {
        stepToTheRight();

        for (int i = 0; i < 4; i++) {
            move();
        }
    }

    private void goBack() throws Exception {
        turnAround();

        for (int i = 0; i < 4; i++) {
            move();
        }

        turnRight();
        move();
    }
}