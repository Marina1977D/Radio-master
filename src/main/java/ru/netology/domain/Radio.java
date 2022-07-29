package ru.netology.domain;

public class Radio {
    String name;

    int maxRadioChannel; //Максимальный радиоканал
    int minRadioChannel; //Минимальный радиоканал
    int currentRadioChannel; //Текущее положение радиоканала

    int maxVolume;  //Максимальный звук
    int minVolume; //Минимальный звук
    int currentVolume; //Текущее положение звука

    public int getMaxRadioChannel() {
        return maxRadioChannel;
    }

    public void setMaxRadioChannel(int maxRadioChannel) {
        this.maxRadioChannel = maxRadioChannel;
    }

    public int getMinRadioChannel() {
        return minRadioChannel;
    }

    public void setMinRadioChannel(int minRadioChannel) {
        this.minRadioChannel = minRadioChannel;
    }

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public void setCurrentRadioChannel(int currentRadioChannel) {
        if (currentRadioChannel > maxRadioChannel) {
            return;
        }
        if (currentRadioChannel < minRadioChannel) {
            return;
        }
        this.currentRadioChannel = currentRadioChannel;
    }

    public void nextCurrentRadioChannel() {
        int currentRadioChannel = this.currentRadioChannel;
        if (currentRadioChannel >= maxRadioChannel) {
            this.currentRadioChannel = minRadioChannel;
        } else {
            this.currentRadioChannel = currentRadioChannel + 1;
        }
    }

    public void prevCurrentRadioChannel() {
        int currentRadioChannel = this.currentRadioChannel;
        if (currentRadioChannel <= minRadioChannel) {
            this.currentRadioChannel = maxRadioChannel;
        } else {
            this.currentRadioChannel = currentRadioChannel - 1;
        }
    }

    public void remoteCurrentRadioChannel(int currentRadioChannel) {
        if (currentRadioChannel > maxRadioChannel) {
            this.currentRadioChannel = maxRadioChannel;
        } else if (currentRadioChannel < minRadioChannel) {
            this.currentRadioChannel = minRadioChannel;
        } else {
            this.currentRadioChannel = currentRadioChannel;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}