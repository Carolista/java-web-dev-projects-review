package org.launchcode;

import java.time.LocalDate;

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

    // TODO: Define custom toString() method
    // Format name, description, price and conditional "NEW!"

    // TODO: Define custom equals() method



    // INSTANCE METHODS

    // TODO: Define instance method isNew()
    // return true if item added within last 90 days

}
