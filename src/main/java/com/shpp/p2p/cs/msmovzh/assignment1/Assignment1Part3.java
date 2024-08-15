package com.shpp.p2p.cs.msmovzh.assignment1;

public class Assignment1Part3 extends SuperKarel {
    public void run() throws Exception {
        markEdgesOfLine();
        while (noBeepersPresent()) {
            moveBeepersToCenter();
            move();
        }
        pickBeeper();
    }

    private void markEdgesOfLine() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
        }

        putBeeper();
        turnAround();
        move();
    }

    private void moveBeepersToCenter() throws Exception {
        while (noBeepersPresent()) {
            move();
        }

        pickBeeper();
        turnAround();
        move();
        putBeeper();
    }
}
