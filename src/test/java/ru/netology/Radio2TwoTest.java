package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Radio2TwoTest {

    @Test
    public void shouldCreateConstructor() {
        Radio2two rad = new Radio2two();
        assertEquals("Orion", rad.getName());
    }


    @Test
    public void shouldCreateRadioWithTenFm() {
        Radio2two rad = new Radio2two("Orion", 10);

        int actual = rad.getFmAmount();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFmInBound() {
        Radio2two rad = new Radio2two("Orion", 10, 8, 0, 9);

        int actual = rad.getCurrentFm();
        int expected = 8;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldStepForward() {
        Radio2two rad = new Radio2two("Orion", 10, 2, 0, 9);

        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForwardOutOfBound() {
        Radio2two rad = new Radio2two("Orion", 10, 12, 0, 9);

        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepBackward() {
        Radio2two rad = new Radio2two("Orion", 10, 9, 0, 9);

        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepBackwardOutOfBound() {
        Radio2two rad = new Radio2two("Orion", 10, -1, 0, 9);


        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 9;

        assertEquals(expected, actual);

    }


    // Volume Tests
    @Test
    public void shouldSetVolumeInBound() {
        Radio2two rad = new Radio2two(8);


        int actual = rad.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeOutOfBoundPositive() {
        Radio2two rad = new Radio2two(100);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldSetVolumeOutOfBoundNegative() {
        Radio2two rad = new Radio2two();

        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio2two rad = new Radio2two(5);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeOutOfBound() {
        Radio2two rad = new Radio2two(99);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {
        Radio2two rad = new Radio2two(66);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 65;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeNegative() {
        Radio2two rad = new Radio2two(-5);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

}