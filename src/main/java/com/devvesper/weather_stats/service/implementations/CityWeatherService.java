package com.devvesper.weather_stats.service.implementations;

import com.devvesper.weather_stats.service.interfaces.CityWeatherInterface;
import org.springframework.stereotype.Service;

@Service
public class CityWeatherService implements CityWeatherInterface {
    @Override
    public String getWeather(String city) {
        return switch (city) {
            case "nampa" -> "Today's forecast - high: 67, low: 48, precipitation: 45%, humidity: 51%, wind: 10mph";
            case "cedar-rapids" ->
                    "Today's forecast - high: 68, low: 56, precipitation: 5%, humidity: 47%, wind: 12mph";
            case "los-angeles" -> "Today's forecast - high: 61, low: 54, precipitation: 20%, humidity: 56%, wind: 6mph";
            default -> "There is not a city named " + city;
        };
    }
}
