package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1. generate random answer
        Passcode answerCode = new Passcode(Answer.answerMaker());
        System.out.println(answerCode.getNumber() + " is the answer to guess");
        //2. prompt user for guess
//        Guess.firstGuess();
        Passcode attempt = new Passcode(Guess.takeAGuess());
        System.out.println(attempt.getNumber());
        // 3. compare guess to answer
        String runCompare = attempt.compareNumber(answerCode.getNumber());
        System.out.println(runCompare);
        //4. if correct, display wooo hooo you win
        Guess.statusCheck(runCompare);
        //5. if partially correct, indicate so

        //6. if guesses > 10, you lose


        //generate a code to guess

//        System.out.println(answerCode.getNumber() + " is the answer to guess");
//
//        attempt.compareNumber(answerCode.getNumber());
//        System.out.println(answerCode.getNumber());


//
//    Guess.runGame();

        //Todo: Run Guess.takeAGuess again if result != '++++'
        //Todo: Add counter for user attempts taken
        //Todo: Add game over message after 10 attempts
        //Todo: WISHLIST: input validation for userGuess
        //Todo: link second and beyond takeAGuess with compareNumber and object initialization,
        // can move guess object to a method on Guess? remove initial guess from Passcode constructor
        // and instead have a setter method on takeAGuess? Or a while loop on Main?
    }
}
