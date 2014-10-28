package com.thoughtworks.iamcoach.guessnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tiny on 14-10-16.
 */
public class GameRunner {
    public static void main(String[] args) throws IOException{
        GameBackup newGame = new GameBackup();
        InputFilter inputFilter = new InputFilter();
        newGame.start();
        int i = 1;
        String flag = "";

        while (i != 0) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputNumber = br.readLine();
            flag = inputFilter.filterUserInput(inputNumber);

            while (!flag.equals("pass") ) {
                System.out.println(inputFilter.filterUserInput(inputNumber));
                System.out.println("Please input again:");
                br = new BufferedReader(new InputStreamReader(System.in));
                inputNumber = br.readLine();
                flag = inputFilter.filterUserInput(inputNumber);
            }

            i = newGame.gameRunOneTime(inputNumber);
        }
    }


}
