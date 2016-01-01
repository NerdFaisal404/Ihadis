package com.app.ihadis;

import android.graphics.Bitmap;

/**
 * Created by Faisal Ahmed on 12/31/2015.
 */
public class ImageItemBook {
    private Bitmap image;
    private String title;

    public ImageItemBook (Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}