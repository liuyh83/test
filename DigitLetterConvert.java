package com.gwi;

import java.util.List;

public class DigitLetterConvert {

    DigitLetterMap map = new DigitLetterMap();

    public String convert(int digit) {
        if (digit < 0 || digit > 99) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        String str = String.valueOf(digit);
        if (str.length() == 1) {
            List ls = map.get(digit);
            for (int i = 0; i < ls.size(); i++) {
                sb.append(ls.get(i) + " ");
            }
        }else {
            char[] cs = str.toCharArray();
            List first = map.get(cs[0] - '0');
            List second = map.get(cs[1] - '0');
            if (first.size() > 0 && second.size() > 0) {
                for (int i = 0; i < first.size(); i++) {
                    for (int j = 0; j < second.size(); j++) {
                        sb.append(first.get(i) + "" + second.get(j) + " ");
                    }
                }
            }else if(first.size() == 0 && second.size() > 0){
                for (int i = 0; i < second.size(); i++) {
                    sb.append(second.get(i) + " ");
                }
            }else if(first.size() > 0 && second.size() == 0){
                for (int i = 0; i < first.size(); i++) {
                    sb.append(first.get(i) + " ");
                }
            }
        }
        return sb.toString().trim();
    }
}
