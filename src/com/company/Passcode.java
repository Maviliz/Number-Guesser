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
        //Done: write function to compare numbers: loop through each digit, return -,+, or " " depending on comparison result
        //String comparison for '-' check was not working, switched to char for easier comparison
        String result = "";
        for (int i = 0; i < target.length(); i++) {
            char current = number.charAt(i);
            if (number.charAt(i) == target.charAt(i)) {
                result = result + "+";
            } else {
                boolean contains = false;
                for (int j = 0; j < target.length(); j++) {
                    if (current == target.charAt(j)) {
                        result = result + "-";
                        contains = true;
                        break;
                        //fixed: fix this logic because it's still printing " " for all other digits of target
                    }
                }
                if (!contains) {
                    result = result + " ";
                }
            }

        }
        System.out.println(result);
        return result;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
