package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tiny on 14-10-28.
 */
public class OutputTest {
    @Test
    public void testOutput() throws IOException {
        String inputMessage = "welcome!";
        OutputStream outputStream = mock(OutputStream.class);
        Output output = new Output();
        output.print(inputMessage, outputStream);
        verify(outputStream).write("welcome!".getBytes());

    }
}
