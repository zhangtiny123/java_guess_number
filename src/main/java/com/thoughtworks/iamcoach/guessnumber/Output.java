package com.thoughtworks.iamcoach.guessnumber;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by tiny on 14-10-28.
 */
public class Output {
    public void print(String inputMessage, OutputStream outputStream) throws IOException {
        outputStream.write(inputMessage.getBytes());
    }
}
