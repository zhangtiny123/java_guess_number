package com.thoughtworks.iamcoach.guessnumber;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by tiny on 14-10-28.
 */
public class Output {

    public Output(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private OutputStream outputStream;

    public void print(String inputMessage) throws IOException {
        outputStream.write(inputMessage.getBytes());
    }

    public void outPrint(String inputMessage) {
        System.out.println(inputMessage);
    }
}
