import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
  @Test
    public void setNextStationPositiveTest() {
        Radio radio = new Radio();

        radio.setNextStation(5);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
