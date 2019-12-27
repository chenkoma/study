package com.nuc;

/**
 * @author koma 10:41 2019-06-20
 * @desc
 */
public class UpperLetter implements ChangeLetter {
    private String str;

    public String getStr(){
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String change() {
        return str.toUpperCase();
    }
}
