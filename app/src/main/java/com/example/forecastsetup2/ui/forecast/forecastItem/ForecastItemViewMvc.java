package com.example.forecastsetup2.ui.forecast.forecastItem;

import com.example.forecastsetup2.networking.schema.ForecastDaySchema;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.ui.common.views.ObservableViewMvc;

public interface ForecastItemViewMvc extends ObservableViewMvc<ForecastItemViewMvc.Listener> {

    public interface Listener {
        void onHourClicked(HourSchema hourSchema);
    }

    void bindDay(HourSchema hourSchema);
}