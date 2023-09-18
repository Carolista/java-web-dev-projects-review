package org.launchcode;

public class Wheel extends BaseDisc implements VariableRPM {

    private int radius;
    private int milesPerHour = 0;

    public Wheel(String name, int radius) {
        super(name, "wheel", 0);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getMilesPerHour() {
        return milesPerHour;
    }

    public void setMilesPerHour(int milesPerHour) {
        String newline = System.lineSeparator();
        this.milesPerHour = milesPerHour;
        if (isValid()) {
            setSpinRate(calculateSpinRate());
            System.out.println(newline + "MPH and spin rate have been updated for " + getName() + ".");
        } else {
            System.out.println(newline + "WARNING: Spin rate was not updated for " + getName() + "." + newline);
            if (radius < 1) {
                System.out.println("Please set a radius greater than 0.");
            }
            if (milesPerHour < 0) {
                System.out.println("Please set a MPH of 0 or more.");
            }
        }
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Radius: " + radius + newline +
                "Current MPH: " + milesPerHour + newline;
    }


    // Methods required by VariableRPM

    @Override
    public boolean isValid() {
        return radius > 0 && milesPerHour >= 0;
    }

    @Override
    public int calculateSpinRate() {
        return Math.round(milesPerHour * INCHES_PER_MILE / (2 * radius * PI * 60));
    }


    // Instance method

    void driveCar() {
        if (milesPerHour > 0) {
            spinDisc();
            System.out.println("You are traveling at " + milesPerHour + " MPH. Please drive safely!");
        } else {
            System.out.println("You're not going anywhere unless you set a MPH greater than 0!");
        }
    }
}
