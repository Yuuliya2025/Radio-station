import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void testBestRadio() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveToTwoStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveToNineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveToZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetInvalidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetLessThanZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetEightStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTenStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHundredVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.next();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.nextIncreaseVolume();
        Assertions.assertEquals(51, radio.getCurrentVolume());

        radio.setCurrentVolume(99);
        radio.nextIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.nextIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        radio.nextDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testSetCurrentVolumeInvalidValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(110);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testMaxVolumeCannotBeIncreased() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void testMinVolumeCannotBeDecreased() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testSetCurrentVolumeBoundaryValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseCurrentStationWhenNotAtFirstStation() {
        Radio radio = new Radio();
        int initialStation = 5;
        radio.setCurrentStation(initialStation);
        radio.prev();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldSetLastStationWhenAtFirstStation() {
        Radio radio = new Radio();
        int initialStation = 0;
        radio.setCurrentStation(initialStation);
        radio.prev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldDecreaseVolumeWhenAboveZero() {
        Radio radio = new Radio();// Arrange
        int initialVolume = 5;
        radio.setCurrentVolume(initialVolume);
        radio.nextDecreaseVolume();
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeWhenAtZero() {
        Radio radio = new Radio();// Arrange
        int initialVolume = 0;
        radio.setCurrentVolume(initialVolume);
        radio.nextDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}






