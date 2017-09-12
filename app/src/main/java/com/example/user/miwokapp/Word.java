package com.example.user.miwokapp;

/**
 * Created by USER on 9/11/2017.
 */

public class Word {

    public String miwokText;
    public String defaultText;

    public Word(){}

    public Word(String miwokText,String defaultText){
        this.miwokText  = miwokText;
        this.defaultText  = defaultText;
    }

    public String getMiwokText() {
        return miwokText;
    }

    public void setMiwokText(String miwokText) {
        this.miwokText = miwokText;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }
}
