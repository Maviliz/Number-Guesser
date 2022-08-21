package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1. generate answer
        Passcode answerCode = new Passcode(Answer.answerMaker());
        //2. prompt user for guess
        Passcode attempt = new Passcode(Guess.takeAGuess());

        // 3. compare guess to answer
        String runCompare = answerCode.compareNumber(answerCode.getNumber());
        System.out.printf(runCompare);
        //4. if correct, display wooo hooo you win

        //5. if partially correct, indicate so

        //6. if guesses > 10, you lose


        //generate a code to guess

        System.out.println(answerCode.getNumber() + " is the answer to guess");

        attempt.compareNumber(answerCode.getNumber());
        System.out.println(answerCode.getNumber());


//
//    Guess.runGame();

        //Todo 1: make random number generator with constraints

        //Todo 2: make user input method

        //Todo 3: make conversion to array to loop through for comparison

        //Todo 4: initialize 'guess' object

        //Todo 5: initialize 'answer' object

        //Todo 6: input validation for userGuess
    }
}
