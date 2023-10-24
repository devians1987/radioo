package ru.netology;

public class Radio {

    private int maxNumber = 9;
    private int minNumber = 0;
    private int currentNumber = minNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.maxNumber = maxNumber;
    }

    public Radio(int amountNumber) {
        this.maxNumber = amountNumber - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minNumber) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxNumber() {
        currentNumber = maxNumber;
    }

    public void setToMinNumber() {
        currentNumber = minNumber;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void nextNumber() {
        if (currentNumber < maxNumber) {
            setCurrentNumber(currentNumber + 1);
        } else {
            setToMinNumber();
        }
    }

    public void prevNumber() {
        if (currentNumber > minNumber) {
            setCurrentNumber(currentNumber - 1);
        } else {
            setToMaxNumber();
        }
    }

    public void augmentVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void decrementVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }
}
