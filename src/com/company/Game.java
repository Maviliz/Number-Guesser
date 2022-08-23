package com.company;


import java.util.Scanner;

public class Game {

    static int attemptsTaken = 0;
    static int maxAttempts = 10;
    private int count = 0;

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }                 //https://www.baeldung.com/java-generating-random-numbers-in-range

    private static String answerMaker() {               //take 4 runs of getRandomNumber and turn into a string, then concatenate
        String step = "";
        String answer = "";
        for (int i = 0; i < 4; i++) {
            int holder = getRandomNumber(1, 7);
            step = String.valueOf(holder);
            answer = answer + step;
        }
        return answer;
    }

    private static String takeAGuess() {  //asks user for a number
        System.out.println("Please enter a 4-digit number. All digits must be between the numbers 1-6: ");
        Scanner input;
        input = new Scanner(System.in);
        String userGuess = input.next();
        attemptsTaken++;
        return userGuess;
    }

    private static void statusCheck(String result) { //compare outcome of Passcode.compareNumber()
        if (result.equals("++++")) {
            System.out.println("Congratulations! You have correctly guessed the code and won the game!");
            System.exit(0);
        } else {
            if (attemptsTaken < maxAttempts) {
                int attemptsLeft = maxAttempts - attemptsTaken;
                System.out.println("Try again! You have " + attemptsLeft + " remaining attempts.");

            } else {
                System.out.println("Max of 10 attempts reached. Game over :(");
            }

        }
    }


    public static void main(String[] args) {
        // write your code here

        // 1. generate random answer
        Passcode answerCode = new Passcode(answerMaker());
//        System.out.println(answerCode.getNumber() + " is the answer to guess"); //delete when finished writing program, only for testing
        //2. prompt user for guess
        Passcode attempt = new Passcode(takeAGuess());

        // 3. compare guess to answer
        String runCompare = attempt.compareNumber(answerCode.getNumber());

        //4. if correct, display wooo hooo you win
        statusCheck(runCompare);

        while (attemptsTaken < 10) {
            attempt.setNumber(takeAGuess());
            runCompare = attempt.compareNumber(answerCode.getNumber());

            statusCheck(runCompare);

        }



        //Finished: Run Guess.takeAGuess again if result != '++++'
        //Finished: Add counter for user attempts taken
        //Finished: Add game over message after 10 attempts
        //Todo: WISHLIST: input validation for userGuess
        //Finished: link second and beyond takeAGuess with compareNumber and object initialization,
        // can move guess object to a method on Guess? remove initial guess from Passcode constructor
        // and instead have a setter method on takeAGuess? Or a while loop on Main?
    }
}
