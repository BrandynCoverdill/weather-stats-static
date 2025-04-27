package com.devvesper.weather_stats.service.implementations;

import com.devvesper.weather_stats.service.interfaces.WeatherInterface;
import org.springframework.stereotype.Service;

@Service
public class TodayWeatherService implements WeatherInterface {
    @Override
    public String getWeather() {
        return "Today's forecast - high: 67, low: 48, precipitation: 45%, humidity: 51%, wind: 10mph";
    }
}
