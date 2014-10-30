package com.thoughtworks.iamcoach.guessnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tiny on 14-10-30.
 */
public class GameRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Number number = new Number();
        Output output = new Output(System.out);
        Game game = new Game(number, bufferedReader, output);
        game.run();
    }
}
