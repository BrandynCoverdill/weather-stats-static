package com.devvesper.weather_stats.service.implementations;

import com.devvesper.weather_stats.service.interfaces.WeatherInterface;
import org.springframework.stereotype.Service;

@Service
public class WeeklyWeatherService implements WeatherInterface {
    @Override
    public String getWeather() {
        return "Weekly forecast - high: 80s, low: 40s, sunny skies ahead";
    }
}
