package com.shpp.p2p.cs.msmovzh.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Draw caterpillar
 */
public class Assignment2Part6 extends WindowProgram {
    private static final int NUM_OF_CIRCLES = 7;

    private static final int DISTANCE_FROM_EDGE = 30;
    private static final int CIRCLE_OFFSET = 120;
    private static final double CATERPILLAR_BEND = 0.4;


    // Constants for circles
    private static final int CIRCLES_DIAMETER = 200;
    private static final Color CIRCLES_COLOR = Color.GREEN;

    private static final int APPLICATION_WIDTH =
            DISTANCE_FROM_EDGE * 2 + (NUM_OF_CIRCLES - 1) * CIRCLE_OFFSET + CIRCLES_DIAMETER;
    private static final int APPLICATION_HEIGHT = 40 +
            (int) (DISTANCE_FROM_EDGE * 2 + CIRCLES_DIAMETER + CIRCLES_DIAMETER * CATERPILLAR_BEND);

    /**
     * Set size of window and draw caterpillar
     */
    public void run() {
        setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        drawCaterpillar();
    }

    /**
     * Draw caterpillar
     */
    private void drawCaterpillar() {
        boolean onDownLine = false;
        int height;
        for (int i = 0; i < NUM_OF_CIRCLES; i++) {
            height = DISTANCE_FROM_EDGE;
            if (onDownLine) {
                height += CIRCLES_DIAMETER * CATERPILLAR_BEND;
            }
            printCircle(DISTANCE_FROM_EDGE + i * CIRCLE_OFFSET, height);
            onDownLine = !onDownLine;
        }
    }

    /**
     * Print circle (part of caterpillar)
     * @param x the width of the upper left corner of the circle
     * @param y the height of the upper left corner of the circle
     */
    private void printCircle(int x, int y) {
        GOval circle = new GOval(x, y, CIRCLES_DIAMETER, CIRCLES_DIAMETER);
        circle.setColor(Color.BLACK);
        circle.setFilled(true);
        circle.setFillColor(CIRCLES_COLOR);
        add(circle);
    }
}