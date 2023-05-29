package ru.netology.javaqa;

public class Radio {
    private int currentRadio; //номер радиостанции
    private int currentVolume; //громкость

    public int getCurrentRadio() {

        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setToMaxRadio() { //выставляем максимум
        currentRadio = 9;
    }

    public void setToMinRadio() { //выставляем максимум
        currentRadio = 0;
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

    public void setToMaxVolume() { //выставляем максимум
        currentVolume = 100;
    }

    public void setToMinVolume() { //выставляем максимум
        currentVolume = 0;
    }

    public void next() {
        if (currentRadio != 9) {
            currentRadio = currentRadio + 1;
        } else {

            currentRadio = 0;
        }
    }
    public void prev() {
        if (currentRadio != 0) {
            currentRadio = currentRadio - 1;
        }
        else {
            currentRadio = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
