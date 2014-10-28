package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */


import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


import static org.fest.assertions.api.Assertions.assertThat;

public class GameTest {
    @Test
    public void testGameStart() throws IOException{
        GameBackup game = new GameBackup();
        game.start();




    }

    public void testGameStep() throws IOException {

    }
}
