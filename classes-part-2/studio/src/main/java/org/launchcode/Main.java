package org.launchcode;

public class Main {

    public static void main(String[] args) {

        // Menu items
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "The classic slice, hot and delicious!", 7.39, "main course");
        MenuItem item2 = new MenuItem("Toasted Ravioli", "A St. Louis favorite, served with a side of pizza sauce", 6.89, "appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", "The ooiest, gooiest dessert this side of the Mississippi", 4.99, "dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "Peppers, onions, mushrooms, olives, and tomatoes make a delicious combo", 6.39, "main course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");

        // Print first item
        System.out.println(item1);

        // Menu
        Menu menu = new Menu();

        // Add items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        // Print menu
        System.out.println(menu);

        // Remove an item and print menu
        menu.removeItem(item4);
        System.out.println(menu);

        // Test equals method
        System.out.println(item1.equals(item2));


        // BONUS MISSION

        // Attempt to add a duplicate item
        MenuItem item6 = new MenuItem("Garlic Breadsticks", "Hot, garlicky carbs FTW", 4.59, "appetizer");
        menu.addItem(item6);
        System.out.println(menu);
    }
}
