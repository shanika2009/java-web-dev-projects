package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        System.out.println("The area of this circle is " + Circle.getArea( 2.5));

    }

}
