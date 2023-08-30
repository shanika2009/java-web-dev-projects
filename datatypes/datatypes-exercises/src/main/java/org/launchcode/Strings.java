package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        System.out.println(quote);
        System.out.println("Please enter word you would like to search");
        String searchWord = input.nextLine().toLowerCase();
        if (quote.contains(searchWord)) {
            System.out.println("true");
            int indexOfWord= quote.indexOf(searchWord);
            int lengthOfWord = searchWord.length();
            System.out.println("Your search term first appears at index " + indexOfWord + ". Your term is " + lengthOfWord + " characters long.");
            String updatedSentence = quote.replace(searchWord, "");
            System.out.println(updatedSentence);
        }else {
            System.out.println("Term not found");
        }
    }
}
