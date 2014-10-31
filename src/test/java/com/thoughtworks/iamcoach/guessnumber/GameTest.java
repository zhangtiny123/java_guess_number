package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */


import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class GameTest {
    @Test
    public void testGameStart() throws IOException {
        Number number = new Number();
        Game game = new Game(number);
        String startMessage = game.startMessage();

        assertThat(startMessage).isEqualTo("Welcome!\nPlease input your number(6):\n");
    }

    @Test
    public void testGameStepSuccess() throws IOException {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        Game game = new Game(number);
        game.startMessage();
        String gameMessage = game.runOneStep("1234");
        assertThat(gameMessage).isEqualTo("congratulations!");
    }

    @Test
    public void testGameStepFailed() {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        Game game = new Game(number);
        game.startMessage();
        String gameMessage = game.runOneStep("4321");
        System.out.println(gameMessage);
        assertThat(gameMessage).isEqualTo("0A4B\nPlease input your number(5):\n");
    }

    @Test
    public void runOneRoundSuccessTest() throws IOException {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("1234");
        Output output = new Output(System.out);
        Game game = new Game(number, bufferedReader, output);
        String message = game.run();
        assertThat(message).isEqualTo("congratulations!");
    }


    @Test
    public void runTwoRoundSuccessTest() throws IOException {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("1674").thenReturn("1234");
        Output output = new Output(System.out);
        Game game = new Game(number, bufferedReader, output);
        String message = game.run();
        assertThat(message).isEqualTo("2A0B\nPlease input your number(5):\ncongratulations!");
    }

    @Test
    public void runSixRoundGameOverTest() throws IOException {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine())
                .thenReturn("1674")
                .thenReturn("1457")
                .thenReturn("3452")
                .thenReturn("9076")
                .thenReturn("1278")
                .thenReturn("7413");
        Output output = new Output(System.out);
        Game game = new Game(number, bufferedReader, output);
        String message = game.run();
        assertThat(message).isEqualTo("2A0B\nPlease input your number(5):\n" +
                "1A1B\nPlease input your number(4):\n" +
                "0A3B\nPlease input your number(3):\n"+
                "0A0B\nPlease input your number(2):\n"+
                "2A0B\nPlease input your number(1):\n"+
                "game over!");
    }

    @Test
    public void runSixRoundSuccessTest() throws IOException {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("1234");
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine())
                .thenReturn("1674")
                .thenReturn("1457")
                .thenReturn("3452")
                .thenReturn("9076")
                .thenReturn("1278")
                .thenReturn("1234");
        Output output = new Output(System.out);
        Game game = new Game(number, bufferedReader, output);
        String message = game.run();
        assertThat(message).isEqualTo("2A0B\nPlease input your number(5):\n" +
                "1A1B\nPlease input your number(4):\n" +
                "0A3B\nPlease input your number(3):\n"+
                "0A0B\nPlease input your number(2):\n"+
                "2A0B\nPlease input your number(1):\n"+
                "congratulations!");
    }
}
