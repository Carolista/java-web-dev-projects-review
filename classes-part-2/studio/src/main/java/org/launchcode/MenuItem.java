package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    // FIELDS

    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;


    // CONSTRUCTORS

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
        // Use line below instead of line above to test isNew() returning false
        // this.dateAdded = LocalDate.parse("2022-06-12");
    }


    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }


    // SPECIAL METHODS

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" +
                description + " | $" + price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        // Cast to class
        MenuItem otherItem = (MenuItem) toBeCompared;

        // Compare
        return this.name.equals(otherItem.getName());
    }


    // INSTANCE METHODS

    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
//        System.out.println(daysBetween + " days since " + name + " was added");
        return daysBetween < 90;
    }
}
