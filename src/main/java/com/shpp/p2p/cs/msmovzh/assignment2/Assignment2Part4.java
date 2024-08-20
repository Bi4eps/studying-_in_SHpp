package com.shpp.p2p.cs.msmovzh.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Draw Italy flag and caption
 */
public class Assignment2Part4 extends WindowProgram {
    private static final int APPLICATION_WIDTH = 500;
    private static final int APPLICATION_HEIGHT = 400;
    private static final String NAME_OF_COUNTRY = "Italy";

    private static final Color COLOR_1 = Color.GREEN;
    private static final Color COLOR_2 = Color.WHITE;
    private static final Color COLOR_3 = Color.RED;

    private static final double FLAG_WIDTH_CORRELATION = 0.8;
    private static final double FLAG_HEIGHT_CORRELATION = 0.7;

    /**
     * Set size of window, draw Italy flag and caption
     */
    public void run() {
        setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        printFlag();
        outputNameOfCountry();
    }

    /**
     * Draw Italy flag
     */
    private void printFlag() {
        double flagWidth = getWidth() * FLAG_WIDTH_CORRELATION;
        double flagHeight = getHeight() * FLAG_HEIGHT_CORRELATION;
        double rectWidth = flagWidth / 3.0;

        double x = (getWidth() - flagWidth) / 2.0;
        double y = (getHeight() - flagHeight) / 2.0;

        printRectangle(COLOR_1, x, y, rectWidth, flagHeight);
        printRectangle(COLOR_2, x + rectWidth, y, rectWidth, flagHeight);
        printRectangle(COLOR_3, x + 2 * rectWidth, y, rectWidth, flagHeight);
    }

    /**
     * Draw rectangle
     * @param color of rectangle
     * @param x - the width of the upper left corner of the rectangle
     * @param y - the height of the upper left corner of the rectangle
     * @param width of rectangle
     * @param height of rectangle
     */
    private void printRectangle(Color color, double x, double y, double width, double height) {
        GRect rect = new GRect(x, y, width, height);
        rect.setColor(Color.BLACK);
        rect.setFilled(true);
        rect.setFillColor(color);
        add(rect);
    }

    /**
     * Print name of the country in the lower left corner
     */
    private void outputNameOfCountry() {
        GLabel text = new GLabel(NAME_OF_COUNTRY);
        text.setFont("Verdana-30");
        double x = getWidth() - text.getWidth() - 10;
        double y = getHeight() - 10;
        add(text, x, y);
    }
}