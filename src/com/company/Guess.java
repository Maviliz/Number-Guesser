package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Guess {
    //fields
    static int attemptsTaken = 0;
    static int maxAttempts = 10;
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
        attemptsTaken++;
        return userGuess;
    }

    public static void statusCheck(String result){
        if (result.equals("++++")) {
            System.out.println("Congratulations! You have correctly guessed the code and won this game!");
        } else {
            if (attemptsTaken < maxAttempts) {
                int remaining =  maxAttempts - attemptsTaken;
                System.out.println("Try again! You have " + remaining + " remaining attempts.");
                takeAGuess();
            } else {
                System.out.println("Max of 10 attempts reached. Game over");
            }

        }
    }
    public static void nextGuess (){
        Passcode newAttempt = new Passcode(Guess.takeAGuess());
    }
//    public static void nextGuess (){
//        attempt.setNumber(this.takeAGuess());
//    }
    }





