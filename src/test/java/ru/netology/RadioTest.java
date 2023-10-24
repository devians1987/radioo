package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    //Номер текущей радиостанции

    @Test
    public void shouldCalcMaxNumber() {
        Radio rad = new Radio(10);
        rad.setToMaxNumber();

        int expected = 9;
        int actual = rad.getMaxNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumber() {
        radio.setCurrentNumber(5);
        int expected = 5;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumber() {
        radio.setToMaxNumber();

        int expected = 9;
        int actual = radio.getMaxNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberFirst() {
        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberSecond() {
        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinNumber() {
        radio.setToMinNumber();

        int expected = 0;
        int actual = radio.getMinNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPlayNextNumberFirst() {
        radio.setCurrentNumber(9);
        radio.nextNumber();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPlayNextNumberSecond() {
        radio.setCurrentNumber(0);
        radio.nextNumber();
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPlayPrevNumberFirst() {
        radio.setCurrentNumber(0);
        radio.prevNumber();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPlayPrevNumberSecond() {
        radio.setCurrentNumber(9);
        radio.prevNumber();
        int expected = 8;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(55);
        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeFirst() {
        radio.setCurrentVolume(107);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeSecond() {
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinVolume() {
        radio.setToMinVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAugmentVolumeFirst() {
        radio.setCurrentVolume(100);
        radio.augmentVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAugmentVolumeSecond() {
        radio.setCurrentVolume(0);
        radio.augmentVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecrementVolumeFirst() {
        radio.setCurrentVolume(0);
        radio.decrementVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecrementVolumeSecond() {
        radio.setCurrentVolume(100);
        radio.decrementVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
