package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Radio2TwoTest{


    @Test
    public void shouldSetFmInBound() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentFm(18);

        int actual = rad.getCurrentFm();
        int expected = 18;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForward() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentFm(18);
        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 19;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForwardOverBound() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentFm(20);
        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldStepBackward() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentFm(5);
        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepBackwardUnderBound() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentFm(0);
        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 19;
    }

//    Volume Tests
//     =========================================================
    @Test
    public void shouldSetVolumeInBound() {
        Radio2two rad = new Radio2two(19);

        rad.setCurrentVolume(33);

        int actual = rad.getCurrentVolume();
        int expected = 33;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldIncreaseVolume() {
        Radio2two rad = new Radio2two();

        rad.setCurrentVolume(33);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 34;

        assertEquals(expected, actual);

    }

    @Test
    public void DoNothingWhileUpMax() {
        Radio2two rad = new Radio2two();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 99;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {
        Radio2two rad = new Radio2two();


        rad.setCurrentVolume(33);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 32;

        assertEquals(expected, actual);

    }

    @Test
    public void DoNothingWhileMinOver() {
        Radio2two rad = new Radio2two();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseNegative() {
        Radio2two rad = new Radio2two();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }






}