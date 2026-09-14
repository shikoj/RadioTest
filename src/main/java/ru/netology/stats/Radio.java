package ru.netology.stats;

public class Radio {
    public int currentStation;
    public int numberOfStations = 10;

    public Radio() {

    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation >= numberOfStations) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation < 0) {
            currentStation = 0;
        } else if (currentStation < numberOfStations - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation < 0) {
            currentStation = numberOfStations - 1;
        } else if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }


    public int currentVolume;

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            currentVolume = 0;
        } else if (volume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            ++currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            --currentVolume;
        }
    }


}
