package br.com.sensedia.aceleradores.repository;

import br.com.sensedia.aceleradores.infraestructure.weather.client.WeatherRestClient;
import br.com.sensedia.aceleradores.infraestructure.weather.model.WeatherRest;
import br.com.sensedia.aceleradores.specification.filter.WeatherFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherRepository {

    @Autowired
    WeatherRestClient weatherRestClient;

    public WeatherRest findByFilter(WeatherFilter filter) {
        return weatherRestClient.getWeatherByCityNameAndCountryAlphaCode(filter.getCityName(), filter.getCountryAlphaCode());
    }

}
