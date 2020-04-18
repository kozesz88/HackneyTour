package com.example.hackneytour;

public class Information {
    private static final int NO_IMAGE_PROVIDED = -1;
    //creating to string
    private int mname;
    private int maddress;
    private int mopeningTime;
    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Information(int name, int address, int openingTime) {
        mname = name;
        maddress = address;
        mopeningTime = openingTime;
    }

    public Information(int name, int address, int openingTime, int imageResourceId) {
        mname = name;
        maddress = address;
        mopeningTime = openingTime;
        mImageResourceId = imageResourceId;
    }

    public int getname() {
        return mname;
    }

    public int getaddress() {
        return maddress;
    }

    public int getopeningTime() {
        return mopeningTime;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}