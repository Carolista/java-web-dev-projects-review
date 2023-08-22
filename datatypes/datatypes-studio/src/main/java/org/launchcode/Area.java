package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for a radius
        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();

        // Calculate area
        double area = Circle.getArea(radius);

        // Print result
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");

        input.close();
    }

}
