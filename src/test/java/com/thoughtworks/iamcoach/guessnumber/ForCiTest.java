package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ForCiTest {

    private ForCi forCi;

    @Before
    public void setUp() throws Exception {
        forCi = new ForCi();
    }

    @Test
    public void should_return_5_when_2_plus_3() {
        assertThat(forCi.plus(2, 3), is(5));
    }

    @Test
    public void should_return_9_when_3_plus_6(){
        assertThat(forCi.plus(3, 6), is(9));
    }

    @Test
    public void should_return_15_when_7_plus_8(){
        assertThat(forCi.plus(7, 8), is(15));
    }
}
