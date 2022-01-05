package com.example.forecastsetup2.ui.forecast;

import com.example.forecastsetup2.networking.schema.ForecastDaySchema;
import com.example.forecastsetup2.networking.schema.HourSchema;
import com.example.forecastsetup2.networking.schema.LocationSchema;
import com.example.forecastsetup2.ui.common.views.ObservableViewMvc;

import java.util.List;

public interface ForecastViewMvc extends ObservableViewMvc<ForecastViewMvc.Listener> {

    public interface Listener {
        void onHourClicked(HourSchema hourSchema);

        void onSearchClicked(String query);
    }

    void setLocation(LocationSchema locationSchema);

    void bindForecast(List<HourSchema> forecastHourSchemaList);

    void showProgressIndication();

    void hideProgressIndication();
}