package com.shpp.p2p.cs.msmovzh.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Draw 4 black circles in the corners and a white square in the center
 */
public class Assignment2Part2 extends WindowProgram {
    // application size
    private static final int APPLICATION_WIDTH = 600;
    private static final int APPLICATION_HEIGHT = 600;

    // Constants for circles
    private static final int CIRCLES_DIAMETER = 200;
    private static final Color CIRCLES_COLOR = Color.BLACK;

    // Constants for square
    private static final int SQUARE_DIAMETER = 400;
    private static final Color SQUARE_COLOR = Color.WHITE;

    /**
     * Draw 4 black circles in the corners and a white square in the center
     */
    public void run() {
        setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        printCircles();
        printSquare();
    }

    /**
     * Draw 4 black circles in the corners
     */
    private void printCircles() {
        printCircle(0, 0);
        printCircle(getWidth() - CIRCLES_DIAMETER, 0);
        printCircle(0, getHeight() - CIRCLES_DIAMETER);
        printCircle(getWidth() - CIRCLES_DIAMETER, getHeight() - CIRCLES_DIAMETER);
    }

    /**
     * Draw white square in the center
     */
    private void printSquare() {
        GRect square = new GRect((getWidth() - SQUARE_DIAMETER) / 2.0,
                (getHeight() - SQUARE_DIAMETER) / 2.0,
                SQUARE_DIAMETER, SQUARE_DIAMETER);
        square.setColor(SQUARE_COLOR);
        square.setFilled(true);
        square.setFillColor(SQUARE_COLOR);
        add(square);
    }

    /**
     * Draw black circle
     * @param x the width of the upper left corner of the circle
     * @param y the height of the upper left corner of the circle
     */
    private void printCircle(int x, int y) {
        GOval circle = new GOval(x, y, CIRCLES_DIAMETER, CIRCLES_DIAMETER);
        circle.setColor(CIRCLES_COLOR);
        circle.setFilled(true);
        circle.setFillColor(CIRCLES_COLOR);
        add(circle);
    }
}
