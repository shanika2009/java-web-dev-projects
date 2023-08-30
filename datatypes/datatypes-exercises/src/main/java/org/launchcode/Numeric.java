package org.launchcode;

import java.util.Scanner;
public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a rectangle");
        double rectangleLength = input.nextDouble();
        System.out.println("Please enter the width of a rectangle");
        double rectangleWidth = input.nextDouble();
        System.out.println(rectangleLength * rectangleWidth);
        input.close();
    }

}
