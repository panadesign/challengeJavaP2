package com.openclassrooms.store;

public class Screen extends Devices {

    private String resolution;

    public Screen(String mBrand, double mPrice, String mResolution) {
    	super(mBrand, mPrice); 
        this.resolution = mResolution;
    }

}
