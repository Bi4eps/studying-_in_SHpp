package com.shpp.p2p.cs.msmovzh.assignment1;

/**
 * Extends the {@code SuperKarel}.
 * Implements scenario where Karel picks up a newspaper and returns to the starting position.
 */
public class Assignment1Part1 extends SuperKarel {
    /**
     * Directs Karel to pick up a newspaper and return to the starting position.
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void run() throws Exception {
        goToNewspaper();
        pickBeeper();
        goBack();
    }

    /**
     * Directs Karel to go to a newspaper
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void goToNewspaper() throws Exception {
        stepToTheRight();

        for (int i = 0; i < 4; i++) {
            move();
        }
    }

    /**
     * Directs Karel to return to the starting position.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void goBack() throws Exception {
        turnAround();

        for (int i = 0; i < 4; i++) {
            move();
        }

        turnRight();
        move();
    }
}