package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-15.
 */

import org.junit.Test;


import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NumberTest {
    @Test
    public void generateNumberTest() {
        Number number = new Number();
        String generatedNumber = number.generateFourNumber();

        assertThat(hasRepeatedNumber(generatedNumber)).isEqualTo(false);
    }

    @Test
    public void isAllNumber() {
        Number number = new Number();
        String generatedNumber = number.generateFourNumber();
        Boolean isNumber = true;
        char zero = '0';
        char nine = '9';

        for(int i=0; i<4; i++){
            if (generatedNumber.charAt(i) < zero || generatedNumber.charAt(i) > nine) {
                isNumber = false;
            }
        }
        assertThat(isNumber).isEqualTo(true);
    }

    @Test
    public void isFourNumber() {
        Number number = new Number();
        String generatedNumber = number.generateFourNumber();

        assertThat(generatedNumber.length()).isEqualTo(4);
    }

    public Boolean hasRepeatedNumber(String number) {
        boolean isRepeated = false;  //0表示不重复

        for(int i=0; i<3; i++) {
            for(int j=i+1; j<4; j++) {
                if(number.charAt(i) == number.charAt(j)){
                    isRepeated = true;
                }
            }
        }
        return isRepeated;
    }
}
