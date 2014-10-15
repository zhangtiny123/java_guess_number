package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */
public class Game {
    private int leftTimes = 6;
    private String fourNumber = "";

    public void start() {
        Number number = new Number();
        this.fourNumber = number.generateFourNumber();
        System.out.println("Welcome!");
        System.out.println("Please input your number(6)");
    }

    public void gameRunOneTime(String inputNumber) {
        this.leftTimes -= 1;
        Number number = new Number();
        String compareResult = number.compareNumber(this.fourNumber, inputNumber);

        if(!compareResult.equals("4A0B") && this.leftTimes != 0) {
            System.out.println(compareResult);
            System.out.println("Please input your number("+this.leftTimes+")");
        }
        else if(compareResult.equals("4A0B")){
            System.out.println("Congratulations!");
        }
        else {
            gameOver();
        }
    }

    public void gameOver() {
        System.out.println("Game over!");
    }
}
