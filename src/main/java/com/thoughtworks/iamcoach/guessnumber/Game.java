package com.thoughtworks.iamcoach.guessnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tiny on 14-10-28.
 */



public class Game {
    private final BufferedReader bufferedReader;
    private static final String SUCCESS_MESSAGE = "congratulations!";
    private static final String GAME_OVER = "game over!";
    private static final String WELCOME_MESSAGE = "Welcome!\n";
    private static final String TIPS_MESSAGE = "\nPlease input your number";
    private int leftTimes;
    private String fourNumber;
    private Output output;

    public Game(Number number) {
        this.leftTimes = 6;
        this.fourNumber = number.generateFourNumber();
        bufferedReader = null;
        this.output = null;
    }

    public Game(Number number, BufferedReader br, Output output) {
        this.leftTimes = 6;
        this.fourNumber = number.generateFourNumber();
        this.bufferedReader = br;
        this.output = output;
    }

    public String startMessage(){
        return WELCOME_MESSAGE +
                TIPS_MESSAGE+"("+this.leftTimes+"):";
    }

    public String runOneStep(String inputNumber) {
        this.leftTimes -= 1;
        String compareResult = new Number().compareNumber(this.fourNumber, inputNumber);

        if(!compareResult.equals("4A0B") && this.leftTimes != 0) {
            return ""+compareResult+ TIPS_MESSAGE + "(" +this.leftTimes+"):\n";
        }
        else if(compareResult.equals("4A0B")){
            return SUCCESS_MESSAGE;
        }
        else {
            return GAME_OVER;
        }
    }


    public String run() throws IOException {
        Boolean isGameOver = false;
        String message = "";
        String totalMessage = "";

        output.print(startMessage());

        while (!isGameOver) {
            String inputNumber = bufferedReader.readLine();
            message = this.runOneStep(inputNumber);
            output.print(message);
            if(message.equals(GAME_OVER) || message.equals(SUCCESS_MESSAGE)) {
                isGameOver = true;
            }
            totalMessage += message;

        }
        return totalMessage;
    }
}
