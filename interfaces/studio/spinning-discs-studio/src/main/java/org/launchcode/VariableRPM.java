package org.launchcode;

public interface VariableRPM {

    static final float PI = 3.1417f; // float instead of double for rounding to int
    static final int INCHES_PER_MILE = 63360;

    boolean isValid();
    int calculateSpinRate();
}
