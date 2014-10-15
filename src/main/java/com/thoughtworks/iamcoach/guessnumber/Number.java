package com.thoughtworks.iamcoach.guessnumber;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tiny on 14-10-15.
 */
public class Number {
    public String generateFourNumber() {
        String number = "";
        String newItem;
        for (int i = 0; i < 4; i++) {
            newItem = "" + generateRandomNumber();
            while (number.contains(newItem)) {
                newItem = "" + generateRandomNumber();
            }
            number += newItem;
        }
        return number;
    }

    public int generateRandomNumber() {
        return new Random().nextInt(10);
    }


    public String compareNumber(String generatedNumber, String guessedNumber) {
        int number_of_A = 0;
        int number_of_B = 0;

        for (int i = 0; i < 4; i++) {
            if (generatedNumber.charAt(i) == guessedNumber.charAt(i)) {
                number_of_A += 1;
            }
            for (int j = 0; j < 4; j++) {
                if ((generatedNumber.charAt(i) == guessedNumber.charAt(j)) && i != j) {
                    number_of_B += 1;
                }
            }
        }

        return number_of_A + "A" + number_of_B + "B";
    }
}
