package ru.netology;

public class Radio2two {



    private int fmAmount = 10;
    private int firstFm = 0;
    private int lastFm = fmAmount - 1;
    private int currentFm;
    private int minVolume;
    private int maxVolume = 99;
    private int currentVolume;

    public Radio2two(int fmAmount) {
        this.fmAmount = fmAmount;
    }


    public Radio2two() {
    }



    public void setCurrentFm(int newCurrentFm) {
        if (currentFm < fmAmount) {
            this.currentFm = newCurrentFm;
        }
        if(currentFm > firstFm) {
            this.currentFm = newCurrentFm;

        }

    }

    public void stepForward() {
        int newFm = currentFm + 1;
        setCurrentFm(newFm);
        if (newFm > lastFm) {
            newFm = getFirstFm();
        }
        this.currentFm = newFm;
    }


    public void stepBackward() {
        int newFm = currentFm - 1;
        setCurrentFm(newFm);
        newFm = lastFm;
        this.currentFm = newFm;

    }

    // Volume adjust - Range from 0 to 10. Triggers "-" and "+".
    // No action while volume 10 + press "+" or volume 0 + press "-".


    public void setCurrentVolume(int newCurrentVolume) {
        if (currentVolume < getMaxVolume()) {
            this.currentVolume = newCurrentVolume;
        }
        if (currentVolume > getMinVolume()) {
            this.currentVolume = newCurrentVolume;
        }


    }

    public void increaseVolume() {
        int newVol = currentVolume + 1;
        setCurrentVolume(newVol);
        if (newVol > maxVolume) {
            newVol = getMaxVolume();
        }
        this.currentVolume = newVol;

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = getMinVolume();
        }

    }

    public int getCurrentFm() {
        return currentFm;
    }

    public int getFirstFm() {
        return firstFm;
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