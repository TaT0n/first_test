package ru.rsue.test.test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.UUID;

/**
 * Created by basic on 08.02.2018.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private DateFormat mDateB;
    private boolean mSolved;

    public Crime(){
        //Generating unique ID
        mId=UUID.randomUUID();
        mDate=new Date();
        mDateB=new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String s, ParsePosition parsePosition) {
                return null;
            }
        };
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public DateFormat getDateB(){
        return mDateB;
    }

    public void setDateB(DateFormat dateB){
        mDateB=dateB;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}