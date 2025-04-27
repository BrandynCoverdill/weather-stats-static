package com.devvesper.weather_stats.service.implementations;

import com.devvesper.weather_stats.service.interfaces.CityWeatherInterface;
import org.springframework.stereotype.Service;

@Service
public class CityWeatherService implements CityWeatherInterface {
    @Override
    public String getWeather(String city) {
        switch (city) {
            case "nampa":
                return "Today's forecast - high: 67, low: 48, precipitation: 45%, humidity: 51%, wind: 10mph";
            case "cedar-rapids":
                return "Today's forecast - high: 68, low: 56, precipitation: 5%, humidity: 47%, wind: 12mph";
            case "los-angeles":
                return "Today's forecast - high: 61, low: 54, precipitation: 20%, humidity: 56%, wind: 6mph";
            default:
                return "There is not a city named " + city;
        }
    }
}
