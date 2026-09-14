package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void defaultNumberOfStation() {
        Assertions.assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    public void CustomNumberOfStation() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30, radio.getNumberOfStations());
    }


    @Test
    public void shouldSetValidStation(){

        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowZero() {
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMax() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }



    // nextStation
    @Test
    public void setNextStationPositiveTest5() {
        radio.currentStation = 5;

        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationPositiveTest_9() {

        radio.currentStation = 9;
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationPositiveTest_0() {

        radio.currentStation = 0;
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNegativeTestUnder0() {
        radio.currentStation = -2;

        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNegativeTestAbove9() {
        radio.currentStation = 10;

        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    /// prevStation

    @Test
    public void setPrevStationPositive5() {
        radio.currentStation = 5;
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationPositive0() {
        radio.currentStation = 0;
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationPositive9() {
        radio.currentStation = 9;
        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationNegativeUnder0() {
        radio.currentStation = -2;
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationNegativeAbove9() {
        radio.currentStation = 10;
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //settervolume
    @Test
    public void setVolumePositiveTest100() {
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumePositiveTest0() {
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeNegativeTestUnder0() {
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeNegativeTestOver100() {
        radio.setVolume(101);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


    ///  volume increase

    @Test
    public void increaseVolumePositiveTest50() {
        radio.setVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumePositiveTest100() {
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNegativeTestUnder0() {
        radio.setVolume(-100);
        radio.increaseVolume();

        int expected = 1; // вообще хотелось бы 0, но так как изначально громкость =0, то прибавляет 1, так как 0 входит в диапазон
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNegativeTestOver100() {
        radio.setVolume(1000);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    //volume decrease

    @Test
    public void decreaseVolumePositiveTest0() {
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumePositiveTest100() {
        radio.setVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNegativeTestOver100() {
        radio.setVolume(101);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNegativeTestUnder0() {
        radio.setVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}
