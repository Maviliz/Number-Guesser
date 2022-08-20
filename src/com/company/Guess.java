package com.company;

import java.lang.reflect.Array;
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

//    public static Array arrayMaker(String text) {   //convert any 4 digit String to array
//        char[] ch = new char[text.length()];
//        for (int i = 0; i < text.length(); i++) {
//            ch[i] = text.charAt(i);
//            return ch;
//        }
//    }

    public static String guessGrade (String userGuess, String answer) {  //guessGrade will need to receive the userGuess as a parameter but also pull in
        //compare user guest to stored answer
        //have to make String into Array?
        for(int i=0; i<answer.length(); i++){ //could make a switch instead of if
            if (userGuess[i]=answer[i]){

            }
        }


    }
    
    public static String runGame(){
        String takeGuess = takeAGuess();
        Array guessArray = arrayMaker(takeGuess);
        String correctAnswer = Answer.answerMaker();
        Array answerArray = arrayMaker(correctAnswer);
        guessGrade(guessArray, answerArray);
        
    }

    //Todo 1: fix "java: incompatible types: char[] cannot be converted to java.lang.reflect.Array" error

    //Todo 2: verify array maker works

    //Todo 3: verify runGame works

    //Todo 4: write guessGrade to compare userGuess to answer


}
