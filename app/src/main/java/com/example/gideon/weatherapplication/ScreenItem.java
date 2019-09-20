package com.example.gideon.weatherapplication;

public class ScreenItem {

    String Title,Desription;
    int screenImg;

    public ScreenItem(String title, String desription, int screenImg) {
        Title = title;
        Desription = desription;
        this.screenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDesription(String desription) {
        Desription = desription;
    }

    public void setScreenImg(int screenImg) {
        this.screenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDesription() {
        return Desription;
    }

    public int getScreenImg() {
        return screenImg;
    }
}
