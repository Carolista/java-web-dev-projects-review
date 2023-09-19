package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class FloppyDisk extends Media implements Rewritable, VariableRPM {

    private static final Map<Double, Integer> SPEEDS = new HashMap<>() {{
        put(3.5, 300);
        put(5.25, 360);
    }};

    private static final Map<Double, Double> CAPACITIES = new HashMap<>() {{
        put(3.5, 1.44);
        put(5.25, 0.36);
    }};

    private double width;

    public FloppyDisk(String name, double width) {
        super(name, "floppy disk", 0, 0);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        String newline = System.lineSeparator();
        if (isValid()) {
            setSpinRate(calculateSpinRate());
            setCapacity(CAPACITIES.get(width));
            System.out.println(newline + "Spin rate and capacity updated for " + getName() + ".");
        } else {
            System.out.println(newline + "WARNING: Spin rate and capacity not set. + newline +" +
                    "Please set a valid width (3.5 or 5.25).");
        }
    }

    @Override
    public String toString() {
        return super.toString() + getFormattedFileList("Files");
    }


    // Methods required by Rewritable

    @Override
    public void writeFile(File file) {
        spinDisc();
        if (getFiles().contains(file)) {
            System.out.println("The file " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING: There is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The file " + file.getName() + " has been added to " + getName() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        spinDisc();
        if (fileIsPresent(file)) {
            getFiles().remove(file);
            System.out.println("The file " + file.getName() + " has been removed from the " + getDiscType());
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
    }

    @Override
    public void runFile(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            System.out.println("Opening " + file.getName() + "...");
        }
    }


    // Methods required by VariableRPM

    @Override
    public boolean isValid() {
        return SPEEDS.containsKey(width) && CAPACITIES.containsKey(width);
    }

    @Override
    public int calculateSpinRate() {
        return SPEEDS.get(width);
    }
}
