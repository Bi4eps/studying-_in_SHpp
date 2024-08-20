package com.shpp.p2p.cs.msmovzh.assignment2;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Draw an optical illusion using boxes
 */
public class Assignment2Part5 extends WindowProgram {
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    private static final int DISTANCE_FROM_EDGE = 20;

    private static final Color BOX_COLOR = Color.BLACK;

    /**
     * Draw boxes
     */
    public void run() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                printSquare(i, j);
            }
        }
    }

    /**
     * Draw box
     * @param i number of box in the row
     * @param j number of box in the column
     */
    private void printSquare(int i, int j) {
        GRect box = new GRect(DISTANCE_FROM_EDGE + i * (BOX_SIZE + BOX_SPACING),
                DISTANCE_FROM_EDGE + j * (BOX_SIZE + BOX_SPACING),
                BOX_SIZE, BOX_SIZE);
        box.setColor(BOX_COLOR);
        box.setFilled(true);
        box.setFillColor(BOX_COLOR);
        add(box);
    }
}