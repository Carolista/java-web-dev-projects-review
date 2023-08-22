package org.launchcode;

import java.util.Scanner;

public class AreaBonusTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Solution for bonus mission 2 */

        double radius; // declare but don't initialize yet

        do {
            System.out.println("Please enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again: ");
                input.next();
                // NOTE: input.next() allows the user to try again for this loop
                // But it will also allow the scanner to advance past this loop if valid
                // so that it can be stored in the radius variable with input.nextDouble() below
            }
            radius = input.nextDouble();

        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");


        // Close scanner
        input.close();
    }

}
