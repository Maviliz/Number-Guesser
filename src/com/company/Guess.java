package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Guess {
    //fields


    private int count = 0;                                  //to keep track of how many ints have been generated
    public ArrayList<String> arr = new ArrayList<>();

    //constructors

    public Guess() {
    }

    //methods
    public static String takeAGuess() {  //asks user for a number
        System.out.println("Please enter a 4-digit number. All digits must be between the numbers 1-6: ");
        Scanner input;
        input = new Scanner(System.in);
        String userGuess = input.next();
        return userGuess;
    }

    public static char[] arrayMaker(String text) {   //convert any 4 digit String to array
        String s = text;
        char[] output = s.toCharArray();
        return output;
    }



 /*   public static String runGame(){
        String takeGuess = takeAGuess();
        Array guessArray = arrayMaker(takeGuess);
        String correctAnswer = Answer.answerMaker();
        Array answerArray = arrayMaker(correctAnswer);
        guessGrade(guessArray, answerArray);
*/
    }





