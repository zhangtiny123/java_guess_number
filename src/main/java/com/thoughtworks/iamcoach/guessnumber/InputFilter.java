package com.thoughtworks.iamcoach.guessnumber;

/**
 * Created by tiny on 14-10-16.
 */
public class InputFilter {
    public String filterUserInput(String inputNumber) {
        if (inputNumber.length() != 4) {
            return "Invalid input length!";
        }
        if (hasRepeatedNumber(inputNumber)) {
            return "the four input number repeated!";
        }
        return "pass";
    }

    public Boolean hasRepeatedNumber(String inputNumber) {
        boolean isRepeated = false;  //0表示不重复

        for(int i=0; i<3; i++) {
            for(int j=i+1; j<4; j++) {
                if(inputNumber.charAt(i) == inputNumber.charAt(j)){
                    isRepeated = true;
                }
            }
        }
        return isRepeated;
    }
}
