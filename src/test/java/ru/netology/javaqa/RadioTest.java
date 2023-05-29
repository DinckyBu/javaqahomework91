package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadio() { //выставить текущую станцию
        Radio radio = new Radio(10); //подготовительная часть

        radio.setCurrentRadio(7);
        int expected = 7;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadio() { //выставить максимальное значение
        Radio radio = new Radio();

        radio.setToMaxRadio();

        int expected = 9;
        int actual = radio.getMaxRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadio() { //выставить минимальное значение
        Radio radio = new Radio();

        radio.setToMinRadio();

        int expected = 0;
        int actual = radio.getMinRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() { //больше максимума не выставляется
        Radio radio = new Radio(10);

        radio.setCurrentRadio(11);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioBeforeMin() { //больше максимума не выставляется
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadio() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentRadio(2);

        radio.next();

        int expected = 3;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadio9() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadio() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentRadio(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadio0() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() { //выставить текущую станцию
        Radio radio = new Radio(); //подготовительная часть

        radio.setCurrentVolume(7);
        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() { //выставить текущую станцию
        Radio radio = new Radio(); //подготовительная часть

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() { //выставить максимальное значение
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() { //выставить минимальное значение
        Radio radio = new Radio();

        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() { //больше максимума не выставляется
        Radio radio = new Radio();

        radio.setCurrentRadio(110);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBeforeMin() { //больше максимума не выставляется
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume100() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume0() { //переключение на одну станцию вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
