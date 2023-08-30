package org.launchcode;

import java.util.Scanner;

public class Numeric2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven");
        double miles = input.nextDouble();
        System.out.println("Please enter the amount of gas you consumed (per gallon)");
        double gas = input.nextDouble();
        double milesperGallon = miles/gas;
        System.out.println("You are running on " + milesperGallon + " mpg.");
        input.close();

    }
}
