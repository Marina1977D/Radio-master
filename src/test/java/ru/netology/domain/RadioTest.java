package ru.netology.domain.contructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio(0,70,80,10,20,10);
        radio.decreaseChannel();
        assertEquals(19, radio.getCurrentChannel());
    }

    @Test
    public void increaseChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void increaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void increaseChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(20);
        radio.increaseChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannel(30);
        radio.decreaseChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void decreaseVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-35);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume() );
    }
    @Test
    public void decreaseChannelMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-40);
        radio.decreaseChannel();
        assertEquals(9, radio.getCurrentChannel());
    }
    @Test
    void shouldSetNextChannel() {
        Radio radio = new Radio(7,10);
        radio.increaseChannel();
        assertEquals(8,radio.getCurrentChannel());
    }

    @Test
    void shouldPreviousChannel() {
        Radio radio = new Radio(7,10);
        radio.decreaseChannel();
        assertEquals(6,radio.getCurrentChannel());
    }

}
