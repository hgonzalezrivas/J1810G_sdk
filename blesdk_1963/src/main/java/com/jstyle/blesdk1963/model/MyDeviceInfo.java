package com.jstyle.blesdk1963.model;

/**
 * Created by Administrator on 2018/4/9.
 */

public class MyDeviceInfo extends SendData{

    boolean DistanceUnit;//1 mile（true）,0km(false)
    boolean is12Hour;//1（12小时）（true），0（24小时制）(false)
    boolean Bright_screen;//1 turn on the bright screen, 0 turn off the bright screen
    boolean isLeft_hands;//1 left hand, 0 right hand
    boolean isHorizontalScreen;//1 Horizontal screen, 0 Vertical screen
    int baseheart=60;//Basic heart rate
    int ScreenBrightness;//Screen brightness  屏幕亮度
    int Dialinterface;//80-88


    public boolean isDistanceUnit() {
        return DistanceUnit;
    }

    public void setDistanceUnit(boolean distanceUnit) {
        DistanceUnit = distanceUnit;
    }

    public boolean isIs12Hour() {
        return is12Hour;
    }

    public void setIs12Hour(boolean is12Hour) {
        this.is12Hour = is12Hour;
    }

    public boolean isBright_screen() {
        return Bright_screen;
    }

    public void setBright_screen(boolean bright_screen) {
        Bright_screen = bright_screen;
    }

    public boolean isLeft_hands() {
        return isLeft_hands;
    }

    public void setLeft_hands(boolean left_hands) {
        isLeft_hands = left_hands;
    }

    public boolean isHorizontalScreen() {
        return isHorizontalScreen;
    }

    public void setHorizontalScreen(boolean horizontalScreen) {
        isHorizontalScreen = horizontalScreen;
    }

    public int getBaseheart() {
        return baseheart;
    }

    public void setBaseheart(int baseheart) {
        this.baseheart = baseheart;
    }

    public int getScreenBrightness() {
        return ScreenBrightness;
    }

    public void setScreenBrightness(int screenBrightness) {
        ScreenBrightness = screenBrightness;
    }

    public int getDialinterface() {
        return Dialinterface;
    }

    public void setDialinterface(int dialinterface) {
        Dialinterface = dialinterface;
    }
}
