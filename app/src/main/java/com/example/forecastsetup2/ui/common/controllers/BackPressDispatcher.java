package com.example.forecastsetup2.ui.common.controllers;

public interface BackPressDispatcher {
    void registerListener(BackPressedListener listener);

    void unregisterListener(BackPressedListener listener);
}
