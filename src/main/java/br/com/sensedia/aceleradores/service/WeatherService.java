package br.com.sensedia.aceleradores.service;

import br.com.sensedia.aceleradores.infraestructure.weather.model.WeatherRest;
import br.com.sensedia.aceleradores.specification.filter.WeatherFilter;

public interface WeatherService {

    WeatherRest findByFilter(WeatherFilter filter);

}
