import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // nextStation
  @Test
    public void setNextStationPositiveTest5() {

        radio.setNextStation(5);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationPositiveTest_9() {

        radio.setNextStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationPositiveTest_0() {

        radio.setNextStation(0);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNegativeTestUnder0() {

        radio.setNextStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNegativeTestAbove9() {

        radio.setNextStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

/// prevStation

    @Test
    public void setPrevStationPositive5() {
      radio.setPrevStation(5);

      int expected = 4;
      int actual = radio.getCurrentStation();

      Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationPositive0() {
        radio.setPrevStation(0);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationPositive9() {
        radio.setPrevStation(9);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationNegativeUnder0() {
        radio.setPrevStation(-2);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationNegativeAbove9() {
        radio.setPrevStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //settervolume
    @Test
    public void setVolumePositiveTest100(){
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumePositiveTest0(){
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeNegativeTestUnder0(){
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeNegativeTestOver100(){
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
