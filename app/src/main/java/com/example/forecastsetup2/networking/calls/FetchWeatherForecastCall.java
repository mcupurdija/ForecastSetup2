package com.example.forecastsetup2.networking.calls;


import android.support.annotation.NonNull;

import com.example.forecastsetup2.common.BaseObservable;
import com.example.forecastsetup2.common.Constants;
import com.example.forecastsetup2.networking.WeatherApi;
import com.example.forecastsetup2.networking.schema.ForecastResponseSchema;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FetchWeatherForecastCall extends BaseObservable<FetchWeatherForecastCall.Listener> {

    public interface Listener {
        void onWeatherForecastFetched(ForecastResponseSchema responseSchema);

        void onWeatherForecastFetchFailed();
    }

    private final WeatherApi mWeatherApi;

    public FetchWeatherForecastCall(WeatherApi weatherApi) {
        mWeatherApi = weatherApi;
    }

    public void fetchWeatherForecastAndNotify(String query, int days) {
        mWeatherApi.getForecast(Constants.WEATHER_API_KEY, query, days, "no", "no")
                .enqueue(new Callback<ForecastResponseSchema>() {
                    @Override
                    public void onResponse(@NonNull Call<ForecastResponseSchema> call, @NonNull Response<ForecastResponseSchema> response) {
                        if (response.isSuccessful()) {
                            notifySuccess(response.body());
                        } else {
                            notifyFailure();
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<ForecastResponseSchema> call, @NonNull Throwable t) {
                        notifyFailure();
                    }
                });
    }

    private void notifySuccess(ForecastResponseSchema responseSchema) {
        for (Listener listener : getListeners()) {
            listener.onWeatherForecastFetched(responseSchema);
        }
    }

    private void notifyFailure() {
        for (Listener listener : getListeners()) {
            listener.onWeatherForecastFetchFailed();
        }
    }
}
