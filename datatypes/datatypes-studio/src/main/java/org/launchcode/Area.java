package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Solution before bonus missions */

//        System.out.println("Please enter a radius: "); // ask
//        double radius = input.nextDouble(); // accept response and store value
//        double area = Circle.getArea(radius); // calculate area
//        System.out.println("The area of a circle with a radius of " + radius + " is: " + area); // print result


        /* Solution for bonus mission 1 */

//        System.out.println("Please enter a radius: ");
//
//        // Validate for data type
//        if (input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//            // Validate for positive number
//            if (radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
//            } else {
//                System.out.println("Sorry, the radius must be a positive number.");
//            }
//        } else {
//            System.out.println("Sorry, that was not a valid number.");
//        }


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
