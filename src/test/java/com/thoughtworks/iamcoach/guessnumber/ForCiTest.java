package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ForCiTest {
    @Test
    public void should_return_5_when_2_plus_3() {
        // given

        //when
        ForCi forCi = new ForCi();
        int plus = forCi.plus(2, 3);

        //then
        assertThat(plus, is(5));
    }
}
