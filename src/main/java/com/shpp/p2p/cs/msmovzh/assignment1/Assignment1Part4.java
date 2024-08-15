package com.shpp.p2p.cs.msmovzh.assignment1;

/**
 * Extends the {@code SuperKarel}.
 * Implements a scenario where Karel fills field with beepers in a checkerboard pattern.
 */
public class Assignment1Part4 extends SuperKarel {
    /**
     * Directs Karel to fill field with beepers in a checkerboard pattern.
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void run() throws Exception {
        putBeeper();
        while (leftIsClear()) {
            fillLine();
            goToNextLine();
        }
        fillLine();
    }

    /**
     * Directs Karel to fill current line with beepers in a checkerboard pattern.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void fillLine() throws Exception {
        while (frontIsClear()) {
            moveWithBeeperCheck();
        }
    }

    /**
     * Directs Karel to move to the next line to be filled.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void goToNextLine() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnRight();

        moveWithBeeperCheck();

        turnRight();
    }

    /**
     * Moves Karel forward and places a beeper if none is present.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void moveWithBeeperCheck() throws Exception {
        if (beepersPresent()) {
            move();
        } else {
            move();
            putBeeper();
        }
    }
}