package com.devvesper.weather_stats.controller;

import com.devvesper.weather_stats.service.interfaces.CityWeatherInterface;
import com.devvesper.weather_stats.service.interfaces.WeatherInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherInterface todayWeather;
    private final WeatherInterface weeklyWeather;
    private final CityWeatherInterface cityWeather;

    public WeatherController(
            @Qualifier("cityWeatherService") CityWeatherInterface cityWeather,
            @Qualifier("todayWeatherService") WeatherInterface todayWeather,
            @Qualifier("weeklyWeatherService") WeatherInterface weeklyWeather
    ) {
        this.cityWeather = cityWeather;
        this.todayWeather = todayWeather;
        this.weeklyWeather = weeklyWeather;
    }

    @GetMapping(path = "/weather/today")
    public String getWeatherToday() {
        return todayWeather.getWeather();
    }

    @GetMapping(path = "/weather/weekly")
    public String getWeeklyWeather() {
        return weeklyWeather.getWeather();
    }

    @GetMapping(path = "/weather/city/{city}")
    public String getCityWeather(@PathVariable String city) {
        return cityWeather.getWeather(city);
    }

}
