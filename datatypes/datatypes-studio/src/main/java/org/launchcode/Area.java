package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Solution before bonus missions */

        System.out.println("Please enter a radius: "); // ask
        double radius = input.nextDouble(); // accept response and store value
        double area = Circle.getArea(radius); // calculate area
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area); // print result

        // Note: I moved the bonus mission solutions to separate classes

        // Close scanner
        input.close();
    }

}
