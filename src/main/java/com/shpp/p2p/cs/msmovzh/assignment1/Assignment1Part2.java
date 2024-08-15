package com.shpp.p2p.cs.msmovzh.assignment1;

/**
 * Extends the {@code SuperKarel}.
 * Implements a scenario where Karel repairs columns.
 */
public class Assignment1Part2 extends SuperKarel {
    /**
     * Directs Karel to repair columns.
     * @throws Exception if an error occurs during Karel's movement.
     */
    public void run() throws Exception {
        fixTheColumn();
        goToFloor();
        fixRemainingColumns();
    }

    /**
     * Directs Karel to fix the current column.
     * @throws Exception if an error occurs during Karel's movement.
     */
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

    /**
     * Directs Karel to fix all remaining columns.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void fixRemainingColumns() throws Exception {
        while (frontIsClear()) {
            moveToNextColumn();
            fixTheColumn();
            goToFloor();
        }
    }

    /**
     * Directs Karel to return to the floor after fixing a column.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void goToFloor() throws Exception {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }

    /**
     * Moves Karel to the next column by stepping four spaces to the right.
     * @throws Exception if an error occurs during Karel's movement.
     */
    private void moveToNextColumn() throws Exception {
        for (int i = 0; i < 4; i++) {
            move();
        }
    }
}