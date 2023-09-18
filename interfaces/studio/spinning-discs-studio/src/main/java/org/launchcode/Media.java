package org.launchcode;

import java.util.ArrayList;

public abstract class Media extends BaseDisc {

    private double capacity;
    private final ArrayList<File> files = new ArrayList<>();

    public Media(String name, String discType, int spinRate, double capacity) {
        super(name, discType, spinRate);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Capacity: " + capacity + " MB" + newline +
                "Space Used: " + getSpaceUsed() + " MB" + newline +
                "Available Space: " + getSpaceAvailable() + " MB" + newline;
    }

    public String getFormattedFileList(String header) {
        StringBuilder fileList = new StringBuilder();
        String newline = System.lineSeparator();
        if (files.size() > 0) {
            fileList.append(newline).append(header).append(":");
            for (File file : files) {
                fileList.append(newline).append("\t").append(file);
            }
        }
        return fileList.toString();
    }

    public boolean fileIsPresent(File file) {
        if (getFiles().contains(file)) {
            return true;
        } else {
            System.out.println("That file does not exist on this " + getDiscType() + ".");
            return false;
        }
    }

    public double getSpaceUsed() {
        int total = 0;
        for (File file : files) {
            total += file.getSize();
        }
        return total;
    }

    public double getSpaceAvailable() {
        if (capacity == 0) return 0;
        return capacity - getSpaceUsed();
    }
}
