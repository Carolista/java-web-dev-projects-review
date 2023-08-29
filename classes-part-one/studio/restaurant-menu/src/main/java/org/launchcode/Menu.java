package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    // FIELDS
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;


    // Allow for default constructor


    // GETTERS & SETTERS

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
