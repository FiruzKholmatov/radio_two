package ru.netology;

public class Radio2two {

    private int fmAmount = 10;
    private int firstFm;
    private int lastFm = getFmAmount();
    private int currentFm;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;


    public Radio2two() {
    }

    public Radio2two(int fmAmount) {
        this.fmAmount = fmAmount;
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
        this.currentFm = newFm;
    }

    public void stepBackward() {
        int newFm = currentFm - 1;
        setCurrentFm(newFm);
        if (newFm < getFirstFm()) {
            newFm = getFirstFm();
        }
        this.currentFm = newFm;

    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < getMinVolume()) {
            return;
        }
        if (CurrentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getMinVolume();
        }
    }

    public int getFmAmount() {
        return fmAmount - 1;
    }

    public void setFmAmount(int fmAmount) {
        this.fmAmount = fmAmount;
    }

    public int getFirstFm() {
        return firstFm;
    }

    public int getLastFm() {
        return getFmAmount();
    }



    public int getCurrentFm() {
        return currentFm;
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