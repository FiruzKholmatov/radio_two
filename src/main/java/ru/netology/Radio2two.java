package ru.netology;

public class Radio2two {
    public String getName() {
        return name;
    }

    private String name = "Orion";
    private int FmAmount = 10;
    private int currentFm = 0;
    private int firstFm = 0;
    private int lastFm = 9;
    private int minVolume = 0;
    private int maxVolume = 99;
    private int currentVolume = 0;


    public Radio2two() {

    }

    public Radio2two(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public Radio2two(String name, int fmAmount) {
        this.name = name;
        FmAmount = fmAmount;
    }


    public Radio2two(String name, int fmAmount, int currentFm, int firstFm, int lastFm) {
        this.name = name;
        FmAmount = fmAmount;
        this.currentFm = currentFm;
        this.firstFm = firstFm;
        this.lastFm = lastFm;
    }


    public void setCurrentFm(int CurrentFm) {
        if (CurrentFm < 0) {
            return;
        }
        if (CurrentFm > getLastFm()) {
            return;
        }
        this.currentFm = CurrentFm;
    }

    public void stepForward() {
        int newFm = currentFm + 1;
        setCurrentFm(newFm);
        if (newFm > 9) {
            newFm = getFirstFm();
        }
        this.currentFm = newFm;
    }


    public void stepBackward() {
        int newFm = currentFm - 1;
        setCurrentFm(newFm);
        if (newFm < 0) {
            newFm = getLastFm();
        }
        this.currentFm = newFm;
    }

    // Volume adjust - Range from 0 to 10. Triggers "-" and "+".
    // No action while volume 10 + press "+" or volume 0 + press "-".


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = currentVolume;

    }

    public void increaseVolume() {
        int newVol = currentVolume + 1;
        setCurrentVolume(newVol);
        if (newVol > 99) {
            newVol = getMaxVolume();
        }
        this.currentVolume = newVol;

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = getMinVolume();
        }

    }


    public int getFmAmount() {
        return FmAmount;
    }

    public int getCurrentFm() {
        return currentFm;
    }

    public int getFirstFm() {
        return firstFm;
    }


    public int getLastFm() {
        return lastFm;
    }


    public int getMinVolume() {
        return minVolume;
    }


    public int getMaxVolume() {
        return maxVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }
}
