package com.example.android.daggerpractice.data.network;

import com.example.android.daggerpractice.data.network.model.WeatherResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET(value = "forecast.json")
    Call<WeatherResponse> getWeatherList(@Query("key") String key, @Query("q") String name, @Query("days") String days, @Query("lang") String lang);

    @GET(value = "forecast.json")
    Observable<WeatherResponse> getWeatherListReactive(@Query("key") String key, @Query("q") String name, @Query("days") String days, @Query("lang") String lang);
}
