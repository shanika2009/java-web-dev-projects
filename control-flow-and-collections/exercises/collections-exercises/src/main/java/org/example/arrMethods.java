package org.example;

import java.util.Arrays;

public class arrMethods {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
//        System.out.println(sentence);
        String[] words = sentence.split(" ");
        String[] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));
        System.out.println(Arrays.toString(words));
//



    }

}
