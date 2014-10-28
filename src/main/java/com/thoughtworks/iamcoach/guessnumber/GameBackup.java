package com.thoughtworks.iamcoach.guessnumber;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;

/**
 * Created by tiny on 14-10-15.
 */
public class GameBackup {
    private int leftTimes = 6;
    private String fourNumber = "";

    public String getFourNumber() {
        return fourNumber;
    }

    public int getLeftTimes() {
        return leftTimes;
    }

    public void start() throws IOException{
        Number number = new Number();
        this.fourNumber = number.generateFourNumber();

        System.out.println("Welcome!");
        System.out.println("Please input your number(6):");
    }

    public int gameRunOneTime(String inputNumber) {
        this.leftTimes -= 1;
        Number number = new Number();
        String compareResult = number.compareNumber(this.fourNumber, inputNumber);

        if(!compareResult.equals("4A0B") && this.leftTimes != 0) {
            System.out.println(compareResult);
            System.out.println("Please input your number("+this.leftTimes+"):");
            return 1;
        }
        else if(compareResult.equals("4A0B")){
            System.out.println("Congratulations!");
            return 0;
        }
        else {
            gameOver();
            return 0;
        }
    }

    public void gameOver() {
        System.out.println("GameBackup over!");

    }
}
