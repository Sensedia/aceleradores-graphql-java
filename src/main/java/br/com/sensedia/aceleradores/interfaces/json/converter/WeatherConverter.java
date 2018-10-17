package br.com.sensedia.aceleradores.interfaces.json.converter;

import br.com.sensedia.aceleradores.infraestructure.weather.model.WeatherRest;
import br.com.sensedia.aceleradores.models.Weather;

public class WeatherConverter {

    public static Weather toWheater(WeatherRest weatherRest) {

        Weather weather = new Weather();

        weather.setId(weatherRest.getId());
        weather.setName(weatherRest.getName());
        weather.setCod(weatherRest.getCod());

        return weather;
    }
}
