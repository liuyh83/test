package com.gwi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitLetterMap {

    public List get(int digit){
        if(digit == 0 || digit == 1){
            return new ArrayList();
        }else if(digit == 2){
            return Arrays.asList('a', 'b', 'c');
        }else if(digit == 3){
            return Arrays.asList('d', 'e', 'f');
        }else if(digit == 4){
            return Arrays.asList('g', 'h', 'i');
        }else if(digit == 5){
            return Arrays.asList('j', 'k', 'l');
        }else if(digit == 6){
            return Arrays.asList('m', 'n', 'o');
        }else if(digit == 7){
            return Arrays.asList('p', 'q', 'r', 's');
        }else if(digit == 8){
            return Arrays.asList('t', 'u', 'v');
        }else{
            return Arrays.asList('w', 'x', 'y', 'z');
        }
    }

}
