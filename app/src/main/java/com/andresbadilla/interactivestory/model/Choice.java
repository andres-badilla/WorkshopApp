package com.andresbadilla.interactivestory.model;

/**
 * Created by Andres Badilla on 9/16/2015.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

}
