package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CompareNumber {
    @Test
    public void compareNumberTest() {
        Number number = new Number();
        assertThat(number.compareNumber("2387", "2387")).isEqualTo("4A0B");

        assertThat(number.compareNumber("2387", "7832")).isEqualTo("0A4B");

        assertThat(number.compareNumber("2387", "2658")).isEqualTo("1A1B");

        assertThat(number.compareNumber("2387", "2378")).isEqualTo("2A2B");
    }
}
