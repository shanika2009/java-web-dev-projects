package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arrExamples {
    public static void main(String[] args) {
//        ArrayList<Integer> arrOfIntegers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8,4,2,9,8));
//        System.out.println(sumEven(arrOfIntegers));
        ArrayList<String> arrOfWords = new ArrayList<>(Arrays.asList("Hello", "Good", "Morning", "Mahki", "and", "Mace"));
//        System.out.println(fiveLetterWords(arrOfWords));
        System.out.println("Enter a word length");
        System.out.println(userSelectChar(arrOfWords));


    }

    //Write a static method to find the sum of all the even numbers in an ArrayList.
// Within main, create a list with at least 10 integers and call your method on the list.
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }


    //Write a static method to print out each word in a list that has exactly 5 letters.
    public static String userSelectChar(ArrayList<String> arr) {
        StringBuilder total = new StringBuilder(10);
        Scanner input = new Scanner(System.in);
        int numChar = input.nextInt();
        for (String words : arr) {
            if (words.length() == numChar) {
                total.append(words);
            }
        }
        return total.toString();
    }
}
//    Modify your code to prompt the user to enter the word length for the search.

