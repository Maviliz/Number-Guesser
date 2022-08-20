package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Answer {
    //fields
    Random rand = new Random();
    private int randomInt = rand.nextInt(1);          //needs to be between 1-6 only
    private int count = 0;                                  //to keep track of how many ints have been generated
    public ArrayList<String> arr = new ArrayList<>();

    //constructors

    public Answer() {
    }

    //methods
    public static int getRandomNumber(int min, int max) {

        return (int) ((Math.random() * (max - min)) + min);                 //https://www.baeldung.com/java-generating-random-numbers-in-range
    }

    public static String answerMaker() {               //take 4 runs of getRandomNumber and turn into a string, then concatenate
        String step = "";
        String answer = "";
        for (int i = 0; i < 4; i++) {
            int holder = getRandomNumber(1, 6);
            step = String.valueOf(holder);
            answer= answer+step;
        }
        return answer;
    }

    public static void printDigit() {

        System.out.println(getRandomNumber(1, 6));
    }





}
