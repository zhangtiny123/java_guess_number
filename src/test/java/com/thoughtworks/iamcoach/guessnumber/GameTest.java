package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */


import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import static org.fest.assertions.api.Assertions.assertThat;

public class GameTest {
    @Test
    public void testGameStart() throws IOException{
        Game game = new Game();
        game.start();

        OutputStream outputStream = mock(OutputStream.class);
        verify(outputStream).write("Welcome!".getBytes());
        verify(outputStream).write("Please input your number(6):".getBytes());

    }

    public void testGameStep() throws IOException {
//        InputStream inputStream = mock(InputStream.class);
//        OutputStream outputStream = mock(OutputStream.class);
//
//        when(inputStream.read(new byte[32])).thenReturn(1234);
//
//        Game game = new Game();
//         input = inputStream.read(new byte[32]);
//        game.gameRunOneTime(inputStream.read().)
    }
}
