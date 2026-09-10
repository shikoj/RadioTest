package ru.netology.stats;
public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int nextStation) {
        if (nextStation < 0) {
            currentStation = 0;
        } else if (nextStation < 9) {
            currentStation = nextStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation(int prevStation) {
        if (prevStation <0 ) {
            currentStation = 9;
        } else if (prevStation > 0) {
            currentStation = --prevStation;
        } else {
            currentStation = 9;
        }
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
