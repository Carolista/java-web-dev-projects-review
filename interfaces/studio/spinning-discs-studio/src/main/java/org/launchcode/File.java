package org.launchcode;

public class File {

    private final String name;
    private final double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name + " - " + size + " MB";
    }
}
