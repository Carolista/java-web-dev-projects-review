package org.launchcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VinylRecord extends Media implements VariableRPM {

    private static final Map<Integer, Integer> SPEEDS = new HashMap<>() {{
        put(12, 33);
        put(7, 45);
        put(10, 78);
    }};

    private int diameter;
    private final String artist;

    public VinylRecord(String name, int diameter, String artist) {
        super(name, "record", 0, 440);
        this.artist = artist;
        setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        String newline = System.lineSeparator();
        this.diameter = diameter;
        if (isValid()) {
            setSpinRate(calculateSpinRate());
            System.out.println("Spin rate updated for " + getName() + ".");
        } else {
            System.out.println("WARNING: Spin rate not updated for " + getName() + "." + newline +
                    "Please enter a valid record diameter (7, 10, or 12).");
        }
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Artist: " + artist + newline +
                getFormattedFileList("Tracks");
    }


    // Methods required by VariableRPM

    @Override
    public boolean isValid() {
        return SPEEDS.containsKey(diameter);
    }

    @Override
    public int calculateSpinRate() {
        return SPEEDS.get(diameter);
    }


    // Instance methods

    void pressVinyl(File[] fileArray) {
        String newline = System.lineSeparator();
        double totalSize = 0;
        for (int i=0; i < fileArray.length; i++) {
            totalSize += fileArray[i].getSize();
        }
        if (totalSize <= getCapacity()) {
            Collections.addAll(getFiles(), fileArray);
            System.out.println(newline + "Vinyl pressed with all tracks for " + getName() + " by " + artist + ".");
        } else {
            System.out.println(newline + "WARNING: There is not enough room for all files to be pressed to vinyl on " + getName() + ".");
        }
    }

    void playTrack(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            System.out.println("You are listening to " + file.getName() + " by " + artist + ".");
        }
    }
}
