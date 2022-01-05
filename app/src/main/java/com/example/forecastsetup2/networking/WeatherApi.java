package com.example.forecastsetup2.networking;

import com.example.forecastsetup2.networking.schema.ForecastResponseSchema;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET("v1/forecast.json")
    Call<ForecastResponseSchema> getForecast(@Query("key") String apiKey, @Query("q") String query, @Query("days") int days, @Query("aqi") String aqi, @Query("alerts") String alerts);
}