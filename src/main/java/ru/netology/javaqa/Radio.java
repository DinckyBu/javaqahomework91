package ru.netology.javaqa;

public class Radio {
    private int minRadio = 0;
    private int maxRadio = 9;
    private int currentRadio = minRadio; //номер радиостанции

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume; //громкость

    public Radio(int size) {
        maxRadio = minRadio + size;
    }

    public Radio() {

    }

    public int getCurrentRadio() {

        return currentRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
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

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setToMaxRadio() { //выставляем максимум
        currentRadio = maxRadio;
    }

    public void setToMinRadio() { //выставляем максимум
        currentRadio = minRadio;
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

    public void setToMaxVolume() { //выставляем максимум
        currentVolume = maxVolume;
    }

    public void setToMinVolume() { //выставляем максимум
        currentVolume = minVolume;
    }

    public void next() {
        if (currentRadio != maxRadio) {
            currentRadio = currentRadio + 1;
        } else {

            currentRadio = minRadio;
        }
    }

    public void prev() {
        if (currentRadio != minRadio) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = maxRadio;
        }
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}

