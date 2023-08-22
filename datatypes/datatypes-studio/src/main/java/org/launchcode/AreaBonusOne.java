package org.launchcode;

import java.util.Scanner;

public class AreaBonusOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Solution for bonus mission 1 */

        System.out.println("Please enter a radius: ");

        // Validate for data type
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            // Validate for positive number
            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
            } else {
                System.out.println("Sorry, the radius must be a positive number.");
            }
        } else {
            System.out.println("Sorry, that was not a valid number.");
        }

        // Close scanner
        input.close();
    }

}
