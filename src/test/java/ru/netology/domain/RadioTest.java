package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test   // Тест переключения следующего радиоканала
    public void nextRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(4);
        radio.nextCurrentRadioChannel();
        assertEquals(5, radio.getCurrentRadioChannel());

    }

    @Test // Тест переключения радиоканала с 9 на 0
    public void nextCurrentMaxRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(9);
        radio.nextCurrentRadioChannel();
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения предыдущего радиоканала
    public void prevaRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(4);
        radio.prevCurrentRadioChannel();
        assertEquals(3, radio.getCurrentRadioChannel());
    }

    @Test // Тест переключения радиоканала с 0 на 9
    public void prevMinRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(0);
        radio.prevCurrentRadioChannel();
        assertEquals(9, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значений
    public void boundaryValuesMaxRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(4);
        radio.remoteCurrentRadioChannel(4);
        assertEquals(4, radio.getCurrentRadioChannel());
    }
    @Test // Тест переключения радиоканала
    public void remoteCurrentMaxRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(4);
        radio.remoteCurrentRadioChannel(10);
        assertEquals(9, radio.getCurrentRadioChannel());
    }

    @Test // Тест граничных значений
    public void boundaryValuesMinRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(4);
        radio.remoteCurrentRadioChannel(-1);
        assertEquals(0, radio.getCurrentRadioChannel());
    }

    @Test // Тест увеличения громкости звука (+)
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test // Тест увеличения громкости звука до max
    public void nextMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test // Тест уменьшения громкости звука (-)
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.prevCurrentVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test // Тест уменьшения громкости звука до min
    public void prevMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test // Тест max радиоканал
    public void setMaxRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        assertEquals(9, radio.getMaxRadioChannel());
    }

    @Test // Тест min радиоканал
    public void setMinRadioChannel() {
        Radio radio = new Radio();
        radio.setMinRadioChannel(0);
        assertEquals(0, radio.getMinRadioChannel());
    }

    @Test // Тест  максимальных граничных значений
    public void setCurrentMaxRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(8);
        radio.setCurrentRadioChannel(11);
        assertEquals(8, radio.getCurrentRadioChannel());
    }

    @Test // Тест минимальных граничных значений
    public void setCurrentMinRadioChannel() {
        Radio radio = new Radio();
        radio.setMaxRadioChannel(9);
        radio.setMinRadioChannel(0);
        radio.setCurrentRadioChannel(8);
        radio.setCurrentRadioChannel(-1);
        assertEquals(8, radio.getCurrentRadioChannel());
    }
    @Test // Тест max громкость звука
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test // Тест min громкость звука
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test // Тест граничных значений
    public void setBoundaryValuesMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(11);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test // Тест граничных значений
    public void setBoundaryValuesMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.setCurrentVolume(-1);
        assertEquals(7, radio.getCurrentVolume());
    }
}