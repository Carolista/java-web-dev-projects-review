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


    // SPECIAL METHODS

    // TODO: Define custom toString() method
    // List menu items, grouped by category


    // INSTANCE METHODS

    // TODO: Define addItem()
    // Make sure to update lastUpdated anytime something is successfully added
    // BONUS MISSION: prevent addition of duplicates


    // TODO: Define removeItem()
    // Make sure to update lastUpdated anytime something is removed

}
