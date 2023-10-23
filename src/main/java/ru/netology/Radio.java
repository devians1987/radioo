package ru.netology;

public class Radio {

    private int currentNumber;

    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxNumber() {
        currentNumber = 9;
    }

    public void setToMinNumber() {
        currentNumber = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void nextNumber() {
        if (currentNumber < 9) {
            setCurrentNumber(currentNumber + 1);
        } else {
            setToMinNumber();
        }
    }

    public void prevNumber() {
        if (currentNumber > 0) {
            setCurrentNumber(currentNumber - 1);
        } else {
            setToMaxNumber();
        }
    }

    public void augmentVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void decrementVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }
}