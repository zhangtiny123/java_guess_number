package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by tiny on 14-10-15.
 */
public class IntegratedTest {
    @Test
    public void  integratedTest() {
        Number number = mock(Number.class);
        when(number.generateFourNumber()).thenReturn("2387");
        Number useNumber = new Number();

        assertThat(useNumber.compareNumber(number.generateFourNumber(), "2387")).isEqualTo("4A0B");

        assertThat(useNumber.compareNumber(number.generateFourNumber(), "7832")).isEqualTo("0A4B");

        assertThat(useNumber.compareNumber(number.generateFourNumber(), "2658")).isEqualTo("1A1B");

        assertThat(useNumber.compareNumber(number.generateFourNumber(), "2378")).isEqualTo("2A2B");
    }
}
