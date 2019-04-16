package com.tw;

public class Grade {
    private double Chinese;
    private double Mathematics;
    private double English;
    private double Programming;

    public Grade(){}

    public Grade(double chinese, double mathematics, double english, double programming){
        this.Chinese = chinese;
        this.Programming = mathematics;
        this.English = english;
        this.Programming = programming;
    }

    public double getChinese() {
        return this.Chinese;
    }

    public double getMathematics() {
        return this.Mathematics;
    }

    public double getEnglish() {
        return this.English;
    }

    public double getProgramming() {
        return this.Programming;
    }

    public void setChinese(double chinese) {
        this.Chinese = chinese;
    }

    public void setMathematics(double mathematics) {
        this.Mathematics = mathematics;
    }

    public void setEnglish(double english) {
        this.English = english;
    }

    public void setProgramming(double programming) {
        this.Programming = programming;
    }

    public double getAverage(){
        return getTotal() / 4;
    }

    public double getTotal(){
        return this.Mathematics + this.Chinese + this.English + this.Programming;
    }
}
