package com.rahul.olx.ModelClasses;

public class BrowseCategoriesModelClass {

    private int image;
    private String name;

    public BrowseCategoriesModelClass(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
