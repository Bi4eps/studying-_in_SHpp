package com.shpp.p2p.cs.msmovzh.assignment2;

import com.shpp.cs.a.console.TextProgram;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Calculate and output the roots of the quadratic formula for the coefficients obtained from the console
 */
public class Assignment2Part1 extends TextProgram {
    private double a, b, c;
    private final String enteringSentence = "Please enter ";

    /**
     * Receive the coefficients from the console, then calculate and output the roots of the quadratic formula
     */
    public void run() {
        setCoefficients();
        outputRoots();
    }

    /**
     * Set {@code a}, {@code b}, and {@code c} coefficients, obtained from the console
     */
    private void setCoefficients() {
        try {
            a = readDouble(enteringSentence + "a: ");
            b = readDouble(enteringSentence + "b: ");
            c = readDouble(enteringSentence + "c: ");
        } catch (Exception e) {
            println("Incorrect values! \n\n");
        }
    }

    /**
     * Output roots calculated by functions {@code calculateRoot1} and {@code calculateRoot2}
     */
    private void outputRoots() {
        double d = calculateDiscriminant();
        if (d > 0) {
            println("There are two roots: " + calculateRootPlus(d) + " and " + calculateRootMinus(d));
        } else if (d == 0) {
            println("There is one root: " + calculateRootPlus(d));
        } else {
            println("There are no real roots");
        }
    }

    /**
     * @return discriminant, calculated by formula "b^2 - 4ac"
     */
    private double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    /**
     * @param discriminant
     * @return root of the quadratic formula, calculated by formula "(-b + √d)/ 2a"
     */
    private double calculateRootPlus(double discriminant) {
        return (-b + sqrt(abs(discriminant))) / (2 * a);
    }

    /**
     * @param discriminant
     * @return root of the quadratic formula, calculated by formula "(-b - √d)/ 2a"
     */
    private double calculateRootMinus(double discriminant) {
        return (-b - sqrt(abs(discriminant))) / (2 * a);
    }
}