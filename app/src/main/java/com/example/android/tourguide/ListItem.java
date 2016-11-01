package com.example.android.tourguide;

import static com.example.android.tourguide.R.id.address;

/**
 * Created by toddskinner on 11/1/16.
 */

public class ListItem {
    private int mNameID;
    private int mAddressID;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public ListItem(int nameID, int addressID){
        mNameID = nameID;
        mAddressID = addressID;
    }

    /**
     * Constructs a new ListItem with initial values for name, address, and image resource ID.
     */
    public ListItem(int nameID, int addressID, int imageResourceID){
        mNameID = nameID;
        mAddressID = addressID;
        mImageResourceID = imageResourceID;
    }

    /**
     * Gets the string value of the name.
     *
     * @return current text in the name.
     */
    public int getName(){
        return mNameID;
    }

    /**
     * Gets the string value of the address.
     *
     * @return current text in the address.
     */
    public int getAddress(){
        return mAddressID;
    }

    /**
     * Gets the int value of the image resource ID.
     *
     * @return int of the image resource ID.
     */
    public int getImageResourceID(){
        return mImageResourceID;
    }

    public boolean hasImage(){
        if(mImageResourceID == NO_IMAGE_PROVIDED){
            return false;
        }
        else
        {
            return true;
        }
    }
}
