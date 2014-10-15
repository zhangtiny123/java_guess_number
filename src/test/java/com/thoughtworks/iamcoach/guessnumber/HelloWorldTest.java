package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {
    @Test
    public void demo_test() {
        assertThat("Hello World").isEqualTo("Hello World");
    }

    @Test
    public void should_be_mock() {
//        HelloWorld helloWorld = mock(HelloWorld.class);
        HelloWorld helloWorld = new HelloWorld();
//        when(helloWorld.beenCalled()).thenReturn("Leave me alone.");

        assertThat(helloWorld.beenCalled()).isEqualTo("Leave me alone.");
    }
}
