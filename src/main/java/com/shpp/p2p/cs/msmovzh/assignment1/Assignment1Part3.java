package com.shpp.p2p.cs.msmovzh.assignment1;

/**
 * Extends the {@code SuperKarel}.
 * Implements a scenario where Karel finds the center of a line.
 */
public class Assignment1Part3 extends SuperKarel {
    /**
     * Directs Karel to find the center of a line.
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void run() throws Exception {
        markEdgesOfLine();
        moveBeepersToCenter();
        pickBeeper();
    }

    /**
     * Directs Karel to mark the edges of the line by placing beepers at both ends.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void markEdgesOfLine() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            move();
        }

        putBeeper();
        turnAround();
        if (frontIsClear()) {
            move();
        }
    }

    /**
     * Directs Karel to move beepers towards the center of the line.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void moveBeepersToCenter() throws Exception {
        while (noBeepersPresent()) {
            moveUntilBeeper();

            pickBeeper();
            turnAround();
            move();
            putBeeper();

            move();
        }
    }

    /**
     * Moves Karel forward until finding a beeper.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void moveUntilBeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }
    }
}