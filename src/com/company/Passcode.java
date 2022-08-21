package com.company;

public class Passcode {
    //fields
    String number;
    //constructor

    public Passcode(String number) {
        this.number = number;
    }

    public Passcode() {
    }

    //methods

    public String compareNumber(String target) {
        //TODO: write function to compare numbers: loop through each digit, return -,+, or " " depending on comparison result
        //TODO: add new results to previous result
        String result ="";
        for (int i = 0; i < target.length(); i++) {
            if (number.charAt(i) == target.charAt(i)) {
                result =result + "+";
            } else {                                    //loop through answer digits and compare to current guess digit
                boolean contains = false;
                String current = number.charAt(i)+"";    //converts int to String
                for (int j=0; j<target.length(); j++) {
                    if (target.charAt(i) == number.charAt(i)) {
                        contains = true;
                        break;
                    }
                }
                if (contains) {
                    result =result + "-";
                } else {
                    result =result + " ";

                }
            }
        }
        return result;
    }

    public String getNumber() {
        return number;
    }
}
