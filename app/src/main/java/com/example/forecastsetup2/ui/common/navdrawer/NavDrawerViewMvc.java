package com.example.forecastsetup2.ui.common.navdrawer;

import android.widget.FrameLayout;

import com.example.forecastsetup2.ui.common.views.ObservableViewMvc;

public interface NavDrawerViewMvc extends ObservableViewMvc<NavDrawerViewMvc.Listener> {

    interface Listener {

        void onForecastClicked();
    }

    FrameLayout getFragmentFrame();

    boolean isDrawerOpen();
    void openDrawer();
    void closeDrawer();

}
